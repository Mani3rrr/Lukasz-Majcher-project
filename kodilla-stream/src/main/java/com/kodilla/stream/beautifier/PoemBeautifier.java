package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, String a,PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text, a);
        System.out.println("Beauty text: " + result);
    }
}
