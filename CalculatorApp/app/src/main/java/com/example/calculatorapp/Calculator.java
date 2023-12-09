package com.example.calculatorapp;

public class Calculator {
    private String previousOperand;
    private String currentOperand;
    private String operation;

    public Calculator() {
        clear();
    }

    public void clear() {
        currentOperand = "";
        previousOperand = "";
        operation = null;
    }

    public void delete() {
        if (!currentOperand.isEmpty()) {
            currentOperand = currentOperand.substring(0, currentOperand.length() - 1);
        }
    }

    public void appendNumber(String number) {
        if (number.equals(".") && currentOperand.contains(".")) {
            return;
        }
        currentOperand += number;
    }

    public void chooseOperation(String operation) {
        if (currentOperand.isEmpty()) {
            return;
        }
        if (previousOperand != null) {
            compute();
        }
        this.operation = operation;
        previousOperand = currentOperand + operation;
        currentOperand = "";
    }

    public void compute() {
        double computation;
        double previous = Double.parseDouble(previousOperand);
        double current = Double.parseDouble(currentOperand);

        switch (operation) {
            case "+":
                computation = previous + current;
                break;

            case "-":
                computation = previous - current;
                break;

            case "÷":
                computation = previous / current;
                break;

            case "×":
                computation = previous * current;
                break;

            default:
                return;
        }

        currentOperand = String.valueOf(computation);
        operation = null;
        previousOperand = "";
    }

    // Getters for currentOperand and previousOperand

    public String getCurrentOperand() {
        return currentOperand;
    }

    public String getPreviousOperand() {
        return previousOperand;
    }
}
