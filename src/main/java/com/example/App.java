package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("login"), 700, 500);
        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(WindowEvent -> {
            WindowEvent.consume();
            logout(stage);
        });
    }

    private void logout(Stage stage) {
        Alert warn = new Alert(Alert.AlertType.CONFIRMATION);
        warn.setTitle("Logout");
        warn.setHeaderText("Yakin ingin keluar?");
        warn.setContentText("klik OK untuk keluar");

        if(warn.showAndWait().get() == ButtonType.OK) {
            System.out.println("Berhasil logout");
            stage.close();
        }
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}