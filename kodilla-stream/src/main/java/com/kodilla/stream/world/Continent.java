package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public final class Continent {

    private final String continentName;
    private List<Country> countries = new ArrayList<>();

    public Continent(String continentName, List<Country> countries) {
        this.continentName = continentName;
        this.countries = countries;
    }

    public List<Country> getCountries() {
        return countries;
    }
    public void addCountries(Country country) {
        countries.add(country);
    }





}
