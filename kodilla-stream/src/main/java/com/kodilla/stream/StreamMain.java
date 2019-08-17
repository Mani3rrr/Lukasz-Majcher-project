package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Calculating expressions with lambdas");
        poemBeautifier.beautify("text", "ABC", (text, a) -> text + a);
        poemBeautifier.beautify("text", "ABC", (text, a) -> a + text + a);
        poemBeautifier.beautify("text", "ABC", (text, a) -> (a+text).toUpperCase());
        poemBeautifier.beautify("text", "ABC", (text, a) -> (a+text+a).toUpperCase());
        poemBeautifier.beautify("text", "ABC", (text, a) -> (a+text).toLowerCase());
        poemBeautifier.beautify("text", "ABC", (text, a) -> (a+text+a).toLowerCase());
        poemBeautifier.beautify("text", "ABC", (text, a) -> text.replace("x", "s"));
        poemBeautifier.beautify("text", "ABC", (text, a) -> (a+text+a).replace("ABC","CBA"));
    }
}