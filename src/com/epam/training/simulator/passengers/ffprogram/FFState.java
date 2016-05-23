package com.epam.training.simulator.passengers.ffprogram;


public class FFState {
    FFProgram ffprogram = new FFProgram();
    private long miles;
    private long points;

    public FFState() {
        this(0, 0);
    }

    private FFState(long miles, long points) {
        this.miles = miles;
        this.points = points;
    }

    public void addMiles(long miles) {
        this.miles += miles;
    }

    public void addPoints(double points) {
        this.points += points;
    }

    public double getDiscount() {

        return ffprogram.calculateDiscount(points);
    }

    @Override
    public String toString() {
        return "FFState{" +
                "miles=" + miles +
                ", points=" + points +
                '}';
    }
}
