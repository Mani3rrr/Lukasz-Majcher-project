package com.kodilla.good.patterns.challenges.Airports;


import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {
    private Set<Flight> flights = new HashSet<Flight>();

    public FlightFinder() {
        flights.add(new Flight("Warszawa", "Lublin"));
        flights.add(new Flight("Warszawa", "Londyn"));
        flights.add(new Flight("Warszawa", "Wrocław"));
        flights.add(new Flight("Londyn", "Warszawa"));
        flights.add(new Flight("Gdańsk", "Warszawa"));
        flights.add(new Flight("Gdańsk", "Wrocław"));
        flights.add(new Flight("Gdańsk", "Londyn"));
        flights.add(new Flight("Radom", "Wrocław"));
        flights.add(new Flight("Radom", "Lublin"));
        flights.add(new Flight("Lublin", "Kraków"));
        flights.add(new Flight("Lublin", "Londyn"));

    }

    public Set<Flight> flightsFrom(String airport) {

        return flights.stream()
                .filter(f -> airport.equals(f.getArrival()))
                .collect(Collectors.toSet());
    }

    public Set<Flight> flightsTo(String airport) {
        return flights.stream()
                .filter(f ->airport.equals(f.getDeparture()))
                .collect(Collectors.toSet());

    }


    public Set<Flight> flightsVia(String airportVia){
        return  flights.stream()
                .filter(f->!(airportVia.equals(f.getDeparture()) == (airportVia.equals(f.getArrival()))))
                .collect(Collectors.toSet());
    }


}