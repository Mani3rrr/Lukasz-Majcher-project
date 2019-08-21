package com.kodilla.exception.test;

public class Flight {

    String departureAirport;
    String arivalAirport;

    public Flight(String departureAirport, String arivalAirport) {
        this.departureAirport = departureAirport;
        this.arivalAirport = arivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArivalAirport() {
        return arivalAirport;
    }
}
