package com.epam.training.simulator;


import java.util.Random;

public class Ticket {

    private final int price;
    private final Flight flight;

    public Ticket(Flight flight) {
        Random rnd = new Random();
        this.price = rnd.nextInt(10) + 1;
        this.flight = flight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "price=" + price +
                ", flight=" + flight +
                '}';
    }
}
