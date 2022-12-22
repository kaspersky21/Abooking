package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class bayarplatController {

    @FXML
    private Button button_back;

    @FXML
    private Button button_pay;

    @FXML
    void backtoPlatresult(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("platbook1.fxml"));
        Stage window = (Stage) button_back.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    void platPay(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("berhasil.fxml"));
        Stage window = (Stage) button_pay.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}
