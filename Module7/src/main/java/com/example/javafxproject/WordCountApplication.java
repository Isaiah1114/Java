package com.example.javafxproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WordCountApplication extends Application {
    int testData = 20;

    public int getTestData() {
        return testData;
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(WordCountApplication.class.getResource("wordcounter-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 650);
        stage.setTitle("Top 20 most used word counter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}