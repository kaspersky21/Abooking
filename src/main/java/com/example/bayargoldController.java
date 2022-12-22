package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class bayargoldController {

    @FXML
    private Button button_back;

    @FXML
    private Button button_pay;

    @FXML
    void backtoGoldresult(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("goldbook.fxml"));
        Stage window = (Stage) button_back.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    void goldPay(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("berhasil.fxml"));
        Stage window = (Stage) button_pay.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}
