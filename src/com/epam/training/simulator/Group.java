package com.epam.training.simulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Group {
    List<Passenger> passengerList;

    public Group(int numberOfPassengers) {
        passengerList = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < numberOfPassengers; i++) {
            passengerList.add(new Passenger(rnd.nextInt(10) + 1));
        }

    }

    public void travel(long miles, double points) {
        for (Passenger p : passengerList) {
            p.addMiles(miles);
            p.addPoints(points);
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "passengerList=" + passengerList +
                '}';
    }
}
