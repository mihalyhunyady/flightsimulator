package com.epam.training.simulator;


public class Passenger {
    FFState fFState;
    private int Id;

    public Passenger(int Id) {
        this.fFState = new FFState();
        this.Id = Id;
    }

}
