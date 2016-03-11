package com.example;

/**
 * Created by suat on 10.03.2016.
 */
public class Calculate {

    private String result;

    private int firstNumber;

    private int secondNumber;

    public Calculate(int firstNumber, int secondNumber) {

        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public String getResult() {
        result=Integer.toString(firstNumber+secondNumber);
        return result;
    }

    public int firstNumber() {
        return firstNumber;
    }

    public int secondNumber() {
        return secondNumber;
    }
}
