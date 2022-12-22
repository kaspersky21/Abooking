package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class bayarsilverController {

    @FXML
    private Button button_back;

    @FXML
    private Button button_pay;

    @FXML
    void backtoSilverresult(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("silverbook.fxml"));
        Stage window = (Stage) button_back.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    void silverPay(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("berhasil.fxml"));
        Stage window = (Stage) button_pay.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}
