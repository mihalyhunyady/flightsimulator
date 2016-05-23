package com.epam.training.simulator;


public class FFState {
    private long miles;
    private long points;

    public FFState() {
        this(0,0);
    }

    private FFState(long miles, long points) {
        this.miles = miles;
        this.points = points;
    }

    public void addMiles(long miles){
        this.miles+=miles;
    }

    public void addPoints(long points){
        this.points+=points;
    }

    public double getDiscount() {
        return new FFProgram().calculateDiscount(points);
    }

}
