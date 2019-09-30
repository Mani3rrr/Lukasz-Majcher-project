package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculator() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //When
        double add = calculator.add(4, 5);
        double sub = calculator.sub(6, 4);
        double mul = calculator.mul(4, 5);
        double div = calculator.div(8, 4);
        //Then
        Assert.assertEquals(9, add,0);
        Assert.assertEquals(2, sub,0);
        Assert.assertEquals(20, mul,0);
        Assert.assertEquals(2, div,0);
    }
}
