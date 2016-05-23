package com.epam.training.simulator;


import java.util.List;

public class Itinerary {
    private final List<Flight> flightList;

    public Itinerary(List<Flight> flightList) {
        this.flightList = flightList;
    }

    public long getMiles() {
        long miles = 0;
        for (Flight flight : flightList) {
            miles += flight.getMiles();
        }
        return miles;
    }

    public List<Flight> getFlights() {
        return flightList;
    }

    public double getPoints() {
        return getMiles() * 0.15;
    }

    @Override
    public String toString() {
        return "Itinerary{" +
                "flightList=" + flightList +
                '}';
    }
}
