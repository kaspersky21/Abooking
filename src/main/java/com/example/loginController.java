package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class loginController {

    @FXML
    private AnchorPane AnchorLogin;

    @FXML
    private Label labelPesan;

    @FXML
    private Button login_button;

    @FXML
    private PasswordField pword;

    @FXML
    private TextField uname;

    @FXML
    public void button_login(ActionEvent event) {

        if (uname.getText().isBlank() == false && pword.getText().isBlank() == false) {
            validateLogin();

        } else {
            labelPesan.setText("Masukkan username dan password");
        }
    }

    public void validateLogin() {
        koneksi Koneksi = new koneksi();
        Connection connectDB = Koneksi.getConnection();

        String verifyLogin = "SELECT count(1) FROM login WHERE username = '" + uname.getText() + "' AND password = '" + pword.getText() + "'";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while (queryResult.next()) {
                if (queryResult.getInt(1) == 1) {
                    labelPesan.setText("Selamat datang");
                    Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
                    Stage window = (Stage) login_button.getScene().getWindow();
                    window.setScene(new Scene(root));
                }else {
                    labelPesan.setText("Invalid Login. Please try again");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
