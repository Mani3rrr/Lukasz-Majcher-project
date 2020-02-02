package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BigSizeDecorator extends AbstractPizzaOrderDecorator {
    public BigSizeDecorator(PizzaOrder pizzaOrder){
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(9));
    }

    @Override
    public String getIngredients(){
        return super.getIngredients() + " in Big Size";
    }
}
