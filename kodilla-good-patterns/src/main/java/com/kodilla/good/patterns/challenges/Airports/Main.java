package com.kodilla.good.patterns.challenges.Airports;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        FlightFinder flightSearch = new FlightFinder();
        Set<Flight> flightSet1 = flightSearch.flightsFrom("Warszawa");
        System.out.println(flightSet1);

        Set<Flight> flightSet2 = flightSearch.flightsTo("Wrocław");
        System.out.println(flightSet2);

        Set<Flight> flightSet3 = flightSearch.flightsVia("Radom");
        System.out.println(flightSet3);
    }
}



