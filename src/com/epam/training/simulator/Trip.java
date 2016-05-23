package com.epam.training.simulator;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trip {

    Group group;
    Itinerary itinerary;
    List<Ticket> ticketList;

    public Trip(Group group, Itinerary itinerary, List<Ticket> tickets) {
        this.itinerary = itinerary;
        this.ticketList = tickets;
        this.group = group;
    }

    public double fare() {
        List<Double> tempPrices = new ArrayList<>();
        for (Passenger p : group.passengerList) {
            tempPrices.addAll(ticketList.stream().map(ticket -> p.fFState.getDiscount() * ticket.getPrice()).collect(Collectors.toList()));
        }
        return tempPrices.stream().mapToDouble(a -> a).average().getAsDouble();
        /*
         for (Passenger p : group.passengerList) {
            for (Ticket ticket : ticketList) {
                tempPrices.add(p.fFState.getDiscount() * ticket.getPrice());
            }
        }
         */
    }

    @Override
    public String toString() {
        return "Trip{" +
                "group=" + group +
                ", itinerary=" + itinerary +
                ", ticketList=" + ticketList +
                '}';
    }
}
