package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private TextField display;


    public void handleButtonClick(ActionEvent actionEvent) {
        Button clickedButton = (Button) actionEvent.getSource();
        String buttonText = clickedButton.getText();


        if (buttonText.equals("=")) {
            String expression = display.getText();

            if (expression.contains("+")){
                String[] parts = expression.split("\\+");
                int number1 = Integer.parseInt(parts[0]);
                int number2 = Integer.parseInt(parts[1]);
                int result = number1 + number2;
                display.setText(String.valueOf(result));
            } else if (expression.contains("-")) {
                String[] parts = expression.split("-");
                int number1 = Integer.parseInt(parts[0]);
                int number2 = Integer.parseInt(parts[1]);
                int result = number1 - number2;
                display.setText(String.valueOf(result));
            } else if (expression.contains("*")) {
                String[] parts = expression.split("\\*");
                int number1 = Integer.parseInt(parts[0]);
                int number2 = Integer.parseInt(parts[1]);
                int result = number1 * number2;
                display.setText(String.valueOf(result));
            } else if (expression.contains("/")) {
                String[] parts = expression.split("\\/");
                int number1 = Integer.parseInt(parts[0]);
                int number2 = Integer.parseInt(parts[1]);
                int result = number1 / number2;
                display.setText(String.valueOf(result));
            }
        }else{
            display.setText(display.getText() + buttonText);
        }

    }
}