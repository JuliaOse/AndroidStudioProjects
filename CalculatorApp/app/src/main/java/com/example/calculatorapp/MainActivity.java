package com.example.calculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView previousOperandText;
    private TextView currentOperandText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        previousOperandText = findViewById(R.id.previousOperand);
        currentOperandText = findViewById(R.id.currentOperand);

        Button equalsButton = findViewById(R.id.equals);
        Button deleteButton = findViewById(R.id.delete);
        Button allClearButton = findViewById(R.id.AC);

    }
    Button numberButtons = findViewById(R.id.number);
    String numbers = numberButtons.getText().toString();


    public void appendNumber() {
        String currentOperand = currentOperandText.getText().toString();
        if (!currentOperand.contains(".")) {
            currentOperand += ".";
            currentOperandText.setText(currentOperand);
        }
        currentOperand += numbers;
        currentOperandText.setText(currentOperand);
    }


    private void performOperation(String operator) {
        String currentOperand = currentOperandText.getText().toString();
        previousOperandText.setText(currentOperand + " " + operator);
        currentOperandText.setText("");
    }


    private void delete() {
        String currentOperand = currentOperandText.getText().toString();
        if (!currentOperand.isEmpty()) {
            currentOperand = currentOperand.substring(0, currentOperand.length() - 1);
            currentOperandText.setText(currentOperand);
        }
    }

    private void clearCalculator() {
        currentOperandText.setText("");
        previousOperandText.setText("");
    }
}
