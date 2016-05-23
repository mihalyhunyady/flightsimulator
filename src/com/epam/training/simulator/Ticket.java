package com.epam.training.simulator;


import java.util.Random;

public class Ticket {

    private final int price;

    public Ticket() {
        Random rnd = new Random();
        this.price = rnd.nextInt(10000) + 1;
    }

    public int getPrice() {
        return price;
    }
}
