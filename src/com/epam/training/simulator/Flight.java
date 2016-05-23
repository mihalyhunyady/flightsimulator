package com.epam.training.simulator;


import java.util.Random;

public class Flight {
    private final long miles;

    public Flight() {
        Random rnd = new Random();
        this.miles = rnd.nextInt(100000000) + 1;
    }

    public long getMiles() {
        return miles;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "miles=" + miles +
                '}';
    }
}
