package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {
    @Test
    public void testBigMacNew() {
        //Given
        BigMac bigmac = new BigMac.BigMacBuilder()
                .bun("Thin")
                .sauce("Ketchup")
                .burgers(2)
                .ingredient("Becon")
                .ingredient("Mushrooms")
                .ingredient("Extra Cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, howManyIngredients);
        Assert.assertEquals("Ketchup", bigmac.getSauce());
        Assert.assertEquals(2, bigmac.getBurgers());
    }
}


