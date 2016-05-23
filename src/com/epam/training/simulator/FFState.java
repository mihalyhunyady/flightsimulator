package com.epam.training.simulator;

/**
 * Created by Laszlo_Konya on 5/23/2016.
 */
public class FFState {
    private long miles;
    private long points;

    public FFState() {
        this(0,0);
    }

    public FFState(long miles, long points) {
        this.miles = miles;
        this.points = points;
    }

    public void addMiles(long miles){
        this.miles+=miles;
    }

    public void addPoints(long points){
        this.points+=points;
    }


}
