package com.example.ui;

import entity.JouerEntity;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Gemeinschaftverwaltung extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Gemeinschaftverwaltung.class.getResource("Firstview.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        //stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        JouerEntity jouerEntity = new JouerEntity() ;
        System.out.println(jouerEntity);
    }

    public static void main(String[] args) {
        launch();
    }
}