package com.example;

import java.io.IOException;
import java.sql.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import javax.swing.JOptionPane;

public class goldbookController extends javax.swing.JFrame {

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

    Connection con = null;
    Statement st=null;

    public goldbookController() {
        initComponents();
    }

    private void initComponents() {
    }

    @FXML
    void backtoGold(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("goldhotel.fxml"));
        Stage window = (Stage) button_back.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @SuppressWarnings("unchecked")

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
            PreparedStatement pStatement = conn.prepareStatement("INSERT INTO gold_book(name, idcard, numberphone, checkin, checkout)" + "VALUES (?,?,?,?,?)");

            pStatement.setString(1, nameField.getText());
            pStatement.setString(2, idcardField.getText());
            pStatement.setString(3, phoneField.getText());
            pStatement.setString(4, checkinField.getText());
            pStatement.setString(5, checkoutField.getText());

            if (pStatement.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(this, "Penambahan sukses", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                Parent root = FXMLLoader.load(getClass().getResource("bayargold.fxml"));
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

//    Parent root = FXMLLoader.load(getClass().getResource("bayargold.fxml"));
//    Stage window = (Stage) button_save.getScene().getWindow();
//    window.setScene(new Scene(root));
}
