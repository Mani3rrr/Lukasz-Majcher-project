package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        BigDecimal theCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void testBasicPizzaIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //When
        String ingredients = pizzaOrder.getIngredients();

        //Then
        assertEquals("Pizza with tomato sauce and cheese", ingredients);
    }

    @Test
    public void testPizzaWithMushroomsBigSizeDeepDishCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new BigSizeDecorator(pizzaOrder);
        pizzaOrder = new DeepDishDecorator(pizzaOrder);

        //When
        BigDecimal theCost = pizzaOrder.getCost();

        //Then
        assertEquals(new BigDecimal(36), theCost);
    }

    @Test
    public void testPizzaWithMushroomsBigSizeDeepDishIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new BigSizeDecorator(pizzaOrder);
        pizzaOrder = new DeepDishDecorator(pizzaOrder);

        //When
        String ingredients = pizzaOrder.getIngredients();

        //Then
        assertEquals("Pizza with tomato sauce and cheese + mushrooms in Big Size + deep-dish", ingredients);
    }
}