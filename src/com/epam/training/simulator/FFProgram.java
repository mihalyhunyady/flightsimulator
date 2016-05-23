package com.epam.training.simulator;


public class FFProgram {

    public double calculateDiscount(long points) {
        if (points > 10) {
            return 0.5;
        } else {
            return 1;
        }
    }
}
