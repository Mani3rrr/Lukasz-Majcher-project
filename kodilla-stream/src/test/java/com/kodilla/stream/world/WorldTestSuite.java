package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        //Europe
        Country poland = new Country("Poland", new BigDecimal("38430000"));
        Country germany = new Country("Germany", new BigDecimal("82790000"));
        Country france = new Country("France", new BigDecimal("66990000"));
        //Asia
        Country china = new Country("China", new BigDecimal("1386000000"));
        Country russia = new Country("Russia", new BigDecimal("147500000"));
        Country japan = new Country("Japan", new BigDecimal("126800000"));
        //Africa
        Country egypt = new Country("Egypt", new BigDecimal("97550000"));
        Country libya = new Country("Libya", new BigDecimal("6375000"));
        Country nigeria = new Country("Nigeria", new BigDecimal("190900000"));
        //South America
        Country mexico = new Country("mexico", new BigDecimal("129200000"));
        Country peru = new Country("Peru", new BigDecimal("32170000"));
        Country brasil = new Country("Brasil", new BigDecimal("209300000"));

        List<Country> europe = new ArrayList<>();
        List<Country> asia = new ArrayList<>();
        List<Country> africa = new ArrayList<>();
        List<Country> southamerica = new ArrayList<>();

        europe.add(poland);
        europe.add(germany);
        europe.add(france);
        asia.add(china);
        asia.add(russia);
        asia.add(japan);
        africa.add(egypt);
        africa.add(libya);
        africa.add(nigeria);
        southamerica.add(brasil);
        southamerica.add(peru);
        southamerica.add(mexico);

        //When
        Continent europee = new Continent("Europe", europe);
        Continent asiaa = new Continent("Asia", asia);
        Continent africaa = new Continent("Africa", africa);
        Continent southamericaa = new Continent("South America", southamerica);

        World world = new World();
        world.addContinents(europee);
        world.addContinents(asiaa);
        world.addContinents(africaa);
        world.addContinents(southamericaa);

        //Then
        BigDecimal people = new BigDecimal("2514005000");
        Assert.assertEquals(people, world.getPeopleQuantity());
    }
}
