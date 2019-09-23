package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements Producent {

    @Override
    public boolean process(OrderRequest orderRequest) {
        System.out.println("GlutenFreeShop realization order...");
        return new SMS().process(orderRequest);
    }
}



