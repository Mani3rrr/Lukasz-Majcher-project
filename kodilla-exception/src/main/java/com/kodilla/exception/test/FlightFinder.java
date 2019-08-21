package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException{

        Map<String,Boolean> flightmap = new HashMap<>();
        flightmap.put("London", true);
        flightmap.put("Warsaw", true);
        flightmap.put("Roma", true);
        flightmap.put("Paris", true);
        flightmap.put("Berlin", false);
        flightmap.put("Moscow", true);
        flightmap.put("Madrit", false);

        if(flightmap.containsKey(flight.getDepartureAirport())){
            if(flightmap.get(flight.getArivalAirport())) {
                System.out.println("This airport is avalible from your place");
            }
        else
            System.out.println("This airport is not avalible from your place ");
        }
        else{
            throw new RouteNotFoundException("Airport doesnt exist");
        }
    }
}
