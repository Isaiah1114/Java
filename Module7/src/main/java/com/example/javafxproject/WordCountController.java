package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class WordCountController {
    int testData = 10;

    @FXML
    private Label welcomeText;
    @FXML
    public TextField textField;

    public static String textboxText = "";

    @FXML
    void onHelloButtonClick() throws IOException {
        textboxText = textField.getText();
        ProjectFileReader test = new ProjectFileReader();
        welcomeText.setText(test.wordCounter());

    }

    @FXML
    protected void onResetButtonClick(){
        welcomeText.setText("");
        textField.setText("");
    }

    @FXML
    void onDefaultButtonClick(){
        textField.setText("TheRavenPoemWithHTMLTags.txt");
        textboxText = textField.getText();
    }


    //for test class
    public int getTestData() {
        return testData;
    }

    public Label getWelcomeText() {
        return welcomeText;
    }

    public TextField getTextField() {
        return textField;
    }

    public static String getTextboxText() {
        return textboxText;
    }
}

