package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class cancelbookController {

    @FXML
    private Button button_back;

    @FXML
    void backtoHome(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage window = (Stage) button_back.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}
