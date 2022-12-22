package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class dendaController {

    @FXML
    private Button button_no;

    @FXML
    private Button button_yes;

    @FXML
    void backtoHistory(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("history.fxml"));
        Stage window = (Stage) button_no.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    void gotoNewhistory(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("cancelbook.fxml"));
        Stage window = (Stage) button_no.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}
