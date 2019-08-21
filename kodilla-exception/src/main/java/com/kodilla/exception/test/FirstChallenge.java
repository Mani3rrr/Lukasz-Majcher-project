package com.kodilla.exception.test;

import java.nio.file.Files;
import java.time.LocalDate;
import java.util.stream.Stream;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        }catch (ArithmeticException e) {
            System.out.println("Oh no, you can't divide by zero " + e);
        }finally {
            System.out.println("Date of operation:" + LocalDate.now());
        }

    }
}