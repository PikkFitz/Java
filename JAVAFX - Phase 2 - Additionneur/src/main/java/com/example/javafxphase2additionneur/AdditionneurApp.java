package com.example.javafxphase2additionneur;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdditionneurApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AdditionneurApp.class.getResource("additionneurView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 380, 470);
        stage.setTitle("Additionneur");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}