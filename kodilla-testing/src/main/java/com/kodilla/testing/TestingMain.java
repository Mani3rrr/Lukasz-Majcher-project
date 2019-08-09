package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calc = new Calculator();

        int result2 = calc.calcAdd();

        if (result2 == 15) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int result3 = calc.calcSub();

        if (result3 == 5) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
