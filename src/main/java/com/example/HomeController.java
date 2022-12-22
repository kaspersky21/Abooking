package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomeController {

    @FXML
    private Button button_about;

    @FXML
    private Button button_ask;

    @FXML
    private Button button_booking;

    @FXML
    private Button button_exit;

    @FXML
    private Button button_history;

    @FXML
    void aboutus(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("aboutus.fxml"));
        Stage window = (Stage) button_about.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    void ask_help(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("askforhelp.fxml"));
        Stage window = (Stage) button_ask.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    void booking(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hotellevel.fxml"));
        Stage window = (Stage) button_booking.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    void exit(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage window = (Stage) button_exit.getScene().getWindow();
        window.setScene(new Scene(root));

    }

    @FXML
    void history(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("history.fxml"));
        Stage window = (Stage) button_history.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}
