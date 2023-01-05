package com.example.javafxphase2scenebuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Form1Controller
{
    @FXML
    public Button button1;
    @FXML
    public Label label1;
    @FXML
    public TextField textfield1;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onButton1Click()
    {
        label1.setText(textfield1.getText());
    }
}