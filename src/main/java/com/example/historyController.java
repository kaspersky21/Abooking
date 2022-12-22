package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class historyController {

    @FXML
    private Button button_back;

    @FXML
    private Button button_cancel;

    @FXML
    void backtoHome(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage window = (Stage) button_back.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    void cancelBooking(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("denda.fxml"));
        Stage window = (Stage) button_cancel.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}
