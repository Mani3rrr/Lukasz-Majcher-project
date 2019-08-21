package com.kodilla.exception.test;


public class FlightMain {

    public static void main(String[] args) {


        FlightFinder flightFinder = new FlightFinder();

        Flight flight1 = new Flight("Warsaw", "London");
        Flight flight2 = new Flight("Roma", "Paris");
        Flight flight3 = new Flight("Moscow", "Madrit");
        Flight flight4 = new Flight("Helsinki", "Madrit");


        try {
            flightFinder.findFlight(flight1);
            flightFinder.findFlight(flight3);
            flightFinder.findFlight(flight4);
            flightFinder.findFlight(flight2);
        }
        catch(RouteNotFoundException e) {
            System.out.println("We haven't this airport i our database " + e);
        }
}
}
