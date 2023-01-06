package com.example.javafxphase2additionneur;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class AdditionneurController
{
    @FXML
    public VBox vbox1;
    @FXML
    public TextArea textArea1;
    @FXML
    public GridPane gridPanel1;
    @FXML
    public Button button0;
    @FXML
    public Button button1;
    @FXML
    public Button button2;
    @FXML
    public Button button3;
    @FXML
    public Button button4;
    @FXML
    public Button button5;
    @FXML
    public Button button6;
    @FXML
    public Button button7;
    @FXML
    public Button button8;
    @FXML
    public Button button9;
    @FXML
    public Button buttonVider;
    @FXML
    public Button buttonCalculer;



    /*@FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/
    @FXML
    protected void button0Click()
    {
        //textArea1.setText("+" + button0.getText());
        textArea1.appendText("+" + button0.getText());
    }
    @FXML
    protected void button1Click()
    {
        //textArea1.setText("+" + button1.getText());
        textArea1.appendText("+" + button1.getText());
    }
    @FXML
    protected void button2Click()
    {
        //textArea1.setText("+" + button2.getText());
        textArea1.appendText("+" + button2.getText());
    }
    @FXML
    protected void button3Click()
    {
        //textArea1.setText("+" + button3.getText());
        textArea1.appendText("+" + button3.getText());
    }
    @FXML
    protected void button4Click()
    {
        //textArea1.setText("+" + button4.getText());
        textArea1.appendText("+" + button4.getText());
    }
    @FXML
    protected void button5Click()
    {
        //textArea1.setText("+" + button5.getText());
        textArea1.appendText("+" + button5.getText());
    }
    @FXML
    protected void button6Click()
    {
        //textArea1.setText("+" + button6.getText());
        textArea1.appendText("+" + button6.getText());
    }
    @FXML
    protected void button7Click()
    {
        //textArea1.setText("+" + button7.getText());
        textArea1.appendText("+" + button7.getText());
    }
    @FXML
    protected void button8Click()
    {
        //textArea1.setText("+" + button8.getText());
        textArea1.appendText("+" + button8.getText());
    }
    @FXML
    protected void button9Click()
    {
        //textArea1.setText("+" + button9.getText());
        textArea1.appendText("+" + button9.getText());
    }
}