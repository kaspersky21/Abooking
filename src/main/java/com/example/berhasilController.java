package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class berhasilController {

    @FXML
    private Button button_ok;

    @FXML
    void nextStep(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage window = (Stage) button_ok.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}
