package com.epam.training.simulator.passengers;


import com.epam.training.simulator.passengers.ffprogram.FFState;

public class Passenger {
    FFState fFState;
    private int Id;

    public Passenger(int Id) {
        this.fFState = new FFState();
        this.Id = Id;
    }

    public void addMiles(long miles) {
        fFState.addMiles(miles);
    }

    public void addPoints(double point) {
        fFState.addPoints(point);
    }

    public FFState getfFState() {
        return fFState;
    }

    public int getId() {
        return Id;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "fFState=" + fFState +
                ", Id=" + Id +
                '}';
    }
}
