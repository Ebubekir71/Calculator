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
            }else if (expression.contains("%")) {
                String[] parts = expression.split("%");
                int number1 = Integer.parseInt(parts[0]);
                int number2 = Integer.parseInt(parts[1]);
                double result = number1 *(number2 / 100.0);
                display.setText(String.valueOf(result));
            }
        }else{
            display.setText(display.getText() + buttonText);
        }
    }

    public void oneBackOnAction(ActionEvent actionEvent) {
        String removeOneNumber = display.getText().substring(0,display.getText().length()-1);
        display.setText(removeOneNumber);
    }

    public void allNumberBackAction(ActionEvent actionEvent) {
        display.setText("0");
    }


}