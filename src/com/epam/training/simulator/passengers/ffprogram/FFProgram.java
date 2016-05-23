package com.epam.training.simulator.passengers.ffprogram;


public class FFProgram {

    public double calculateDiscount(long points) {
        if (points > 10) {
            return 0.5;
        } else {
            return 1;
        }
    }
}
