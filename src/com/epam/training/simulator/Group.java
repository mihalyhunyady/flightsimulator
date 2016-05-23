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
            passengerList.add(new Passenger(rnd.nextInt(1000000) + 1));
        }

    }
}
