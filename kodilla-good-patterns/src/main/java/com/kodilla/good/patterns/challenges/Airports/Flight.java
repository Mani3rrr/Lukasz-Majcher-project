package com.kodilla.good.patterns.challenges.Airports;


import java.util.Objects;

public  class Flight {
    private final String arrival;
    private final String departure;

    public Flight(String arrival, String departure) {
        this.arrival = arrival;
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(arrival, flight.arrival) &&
                Objects.equals(departure, flight.departure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrival, departure);
    }

    @Override
    public String toString() {
        return "Samolot z: " +  arrival  +
                " leci do: " + departure ;
    }
}