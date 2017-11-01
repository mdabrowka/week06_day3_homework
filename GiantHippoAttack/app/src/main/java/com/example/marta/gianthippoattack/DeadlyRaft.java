package com.example.marta.gianthippoattack;

/**
 * Created by marta on 01/11/2017.
 */

public class DeadlyRaft extends Vehicle {

    @Override
    public String attackHippoDeadly() {
        return "Drowning with my weight";
    }

    @Override
    public String attackHippoNonDeadly() {
        return "Throwing logs of wood";
    }

}
