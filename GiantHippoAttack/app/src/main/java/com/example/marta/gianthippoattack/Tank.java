package com.example.marta.gianthippoattack;

/**
 * Created by marta on 01/11/2017.
 */

public class Tank extends Vehicle {

    @Override
    public String attackHippoDeadly() {
        return "Grinding with my wheels";
    }

    @Override
    public String attackHippoNonDeadly() {
        return "Making scary noises";
    }
}
