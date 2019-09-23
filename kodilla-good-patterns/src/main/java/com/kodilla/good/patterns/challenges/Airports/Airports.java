package com.kodilla.good.patterns.challenges.Airports;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Airports {
    private Map<Airport, List<Airport>> airports = new HashMap<>();

    public Map<Airport, List<Airport>> retrieve(){

        Airport lublin = new Airport("Lublin");
        Airport warsaw = new Airport("Warszawa");
        Airport radom = new Airport("Radom");
        Airport krakow = new Airport("Kraków");
        Airport wroclaw = new Airport("Wrocław");
        Airport amsterdam = new Airport("Amsterdam");
        Airport london = new Airport("Londyn");

        airports.put(lublin,    Arrays.asList(warsaw, radom, london));
        airports.put(krakow,     Arrays.asList(amsterdam, warsaw));
        airports.put(wroclaw,     Arrays.asList(warsaw, london, lublin));
        airports.put(warsaw,     Arrays.asList(wroclaw, lublin, radom, london));
        airports.put(london,     Arrays.asList(amsterdam));

        return airports;
    }

    public Map<Airport, List<Airport>> getAirportsMap() {
        return airports;
    }
}
