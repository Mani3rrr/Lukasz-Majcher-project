package com.kodilla.exception.test;

import java.time.LocalDate;

public class ExceptionHandling {

    public static void main(String args[]) {

        SecondChallenge challenge = new SecondChallenge();

        try {
            challenge.probablyIWillThrowException(3,1);
        } catch (Exception e) {
            System.out.println("oh no: " + e);
        }
        finally{
            System.out.println("Date of operation: " + LocalDate.now());
        }
    }
}
