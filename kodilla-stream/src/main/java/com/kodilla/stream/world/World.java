package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    private List<Continent> continents = new ArrayList<>();

    public void addContinents(Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(c -> c.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
