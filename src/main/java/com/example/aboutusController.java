package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class aboutusController {

    @FXML
    private Button buttonBack;

    @FXML
    void backhome(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage window = (Stage) buttonBack.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}
