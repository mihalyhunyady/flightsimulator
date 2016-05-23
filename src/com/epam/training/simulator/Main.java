package com.epam.training.simulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static List<Flight> flights = new ArrayList<>();
    static Group tesztnyulak = new Group(3);
    static Group egynyul = new Group(1);

    public static void main(String[] args) {
        //ConsoleMenu menu = new ConsoleMenu();
        //menu.startConsole();
        addSomeFlights(10);
        Trip bookedTrip = bookTrip(egynyul, 2);
        buyTrip(bookedTrip);
    }

    private static void addSomeFlights(int numberOfFlights) {
        for (int i = 0; i < numberOfFlights; i++) {
            flights.add(new Flight());
        }
    }

    private static Trip bookTrip(Group group, int numberOfTransfer) {
        Collections.shuffle(flights);
        Itinerary itinerary = new Itinerary(flights.subList(0, numberOfTransfer));

        List<Ticket> tickets = itinerary.getFlights().stream().map(Ticket::new).collect(Collectors.toList());

       /*
               List<Ticket> tickets = new ArrayList<>();
        for (Flight flight : itinerary.getFlights()) {
            tickets.add(new Ticket(flight));
        }*/
        return new Trip(group, itinerary, tickets);
    }

    private static void buyTrip(Trip trip) {
        trip.group.travel(trip.itinerary.getMiles(), trip.itinerary.getPoints());
    }

    private static void cancelTrip(Trip trip) {
        trip.group.travel(-trip.itinerary.getMiles(), -trip.itinerary.getPoints());
    }

}
