package com.epam.training.simulator;

import com.epam.training.simulator.passengers.Group;
import com.epam.training.simulator.trip.Flight;
import com.epam.training.simulator.trip.Ticket;
import com.epam.training.simulator.trip.Trip;
import com.epam.training.simulator.trip.itinerary.Itinerary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static List<Flight> flights = new ArrayList<>();
    static Group tesztnyulak = new Group(3);
    static Group egynyul = new Group(1);

    public static void main(String[] args) {

        addSomeFlights(10);
        Trip bookedTrip = bookTrip(tesztnyulak, 5);

        System.out.println(bookedTrip);
        System.out.println("ár: " + bookedTrip.fare());
        System.out.println(tesztnyulak);

        buyTrip(bookedTrip);
        buyTrip(bookedTrip);
        buyTrip(bookedTrip);
        buyTrip(bookedTrip);
        System.out.println(tesztnyulak);

        bookedTrip = cancelTrip(bookedTrip);
        System.out.println("canceled:" + bookedTrip);
        Trip bookedTrip2 = bookTrip(tesztnyulak, 5);

        System.out.println(bookedTrip2);
        System.out.println("ár: " + bookedTrip2.fare());
        System.out.println(tesztnyulak);
    }

    private static void addSomeFlights(int numberOfFlights) {
        for (int i = 0; i < numberOfFlights; i++) {
            flights.add(new Flight());
        }
    }

    private static Trip bookTrip(Group group, int numberOfTransfers) {
        Collections.shuffle(flights);
        Itinerary itinerary = new Itinerary(flights.subList(0, numberOfTransfers));

        List<Ticket> tickets = itinerary.getFlights().stream().map(Ticket::new).collect(Collectors.toList());

       /*
               List<Ticket> tickets = new ArrayList<>();
        for (Flight flight : itinerary.getFlights()) {
            tickets.add(new Ticket(flight));
        }*/
        return new Trip(group, itinerary, tickets);
    }

    private static void buyTrip(Trip trip) {
        trip.getGroup().travel(trip.getItinerary().getMiles(), trip.getItinerary().getPoints());
    }

    private static Trip cancelTrip(Trip trip) {
        trip.getGroup().travel(-trip.getItinerary().getMiles(), -trip.getItinerary().getPoints());
        trip.cancel();
        return trip;
    }


}
