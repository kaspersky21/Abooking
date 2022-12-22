package com.example;

import java.io.IOException;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class silverbookController extends javax.swing.JFrame {

    @FXML
    private Button button_back;

    @FXML
    private Button button_save;

    @FXML
    private TextField checkinField;

    @FXML
    private TextField checkoutField;

    @FXML
    private TextField idcardField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField phoneField;

    @FXML
    void backtoSilver(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("silverhotel.fxml"));
        Stage window = (Stage) button_back.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    public void saveBooking(ActionEvent event) throws IOException {
        String user="root";
        String pswd ="";
        String host="localhost";
        String database="abooking";
        String url="";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            url = "jdbc:mysql://"+ host +"/"+ database+ "?user=" + user + "&password="+pswd;

            Connection conn = DriverManager.getConnection(url);
            PreparedStatement pStatement = conn.prepareStatement("INSERT INTO silver_book(name, idcard, numberphone, checkin, checkout)" + "VALUES (?,?,?,?,?)");

            pStatement.setString(1, nameField.getText());
            pStatement.setString(2, idcardField.getText());
            pStatement.setString(3, phoneField.getText());
            pStatement.setString(4, checkinField.getText());
            pStatement.setString(5, checkoutField.getText());

            if (pStatement.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(this, "Penambahan sukses", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                Parent root = FXMLLoader.load(getClass().getResource("bayarsilver.fxml"));
                Stage window = (Stage) button_save.getScene().getWindow();
                window.setScene(new Scene(root));
            } else {
                JOptionPane.showMessageDialog(this, "Penambahan gagal", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                pStatement.close();
                conn.close();
                nameField.setText("");
                idcardField.setText("");
                phoneField.setText("");
                checkinField.setText("");
                checkoutField.setText("");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("jdbc.Driver tidak ditemukan");
        }
        catch (SQLException e) {
            System.out.println("koneksi gagal " + e.toString());
        }
    }

}
