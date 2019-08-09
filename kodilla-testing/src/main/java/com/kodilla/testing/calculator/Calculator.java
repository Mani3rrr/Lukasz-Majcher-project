package com.kodilla.testing.calculator;

public class Calculator {
    int a = 10;
    int b = 5;
    public int calcAdd(){
        return a + b;
    }
    public int calcSub(){
       return a - b;
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.calcAdd();
        calculator.calcSub();
    }
}
