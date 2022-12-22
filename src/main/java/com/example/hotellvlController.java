package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class hotellvlController {

    @FXML
    private Button button_back;

    @FXML
    private Button button_gold;

    @FXML
    private Button button_plat;

    @FXML
    private Button button_silver;

    @FXML
    void backtohome(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Stage window = (Stage) button_back.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    void hotel_gold(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("goldhotel.fxml"));
        Stage window = (Stage) button_gold.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    void hotel_platinum(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("plathotel.fxml"));
        Stage window = (Stage) button_plat.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    void hotel_silver(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("silverhotel.fxml"));
        Stage window = (Stage) button_silver.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}
