package com.epam.training.simulator.trip;


import com.epam.training.simulator.passengers.Group;
import com.epam.training.simulator.passengers.Passenger;
import com.epam.training.simulator.trip.itinerary.Itinerary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trip {

    Group group;
    Itinerary itinerary;
    List<Ticket> ticketList;
    Ticket[] array;

    public Trip(Group group, Itinerary itinerary, List<Ticket> tickets) {
        this.itinerary = itinerary;
        this.ticketList = tickets;
        this.group = group;
    }

    public double fare() {
        List<Double> tempPrices = new ArrayList<>();
        for (Passenger p : group.getPassengerList()) {
            tempPrices.addAll(ticketList.stream().map(ticket -> p.getfFState().getDiscount() * ticket.getPrice()).collect(Collectors.toList()));
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

    public void cancel() {
        itinerary.cancel();
        ticketList.clear();

    }

    public Group getGroup() {
        return group;
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
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
