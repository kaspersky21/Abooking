package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class goldController {

    @FXML
    private Button button_back;

    @FXML
    private Button button_pilih;

    @FXML
    void backtoLevel(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hotellevel.fxml"));
        Stage window = (Stage) button_back.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    void santikaHotel(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("goldbook.fxml"));
        Stage window = (Stage) button_pilih.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}
