package com.example.marta.gianthippoattack;

/**
 * Created by marta on 01/11/2017.
 */

public abstract class Hippo {
    public String name;
    public int healthValue;
    public int attackValue;


    public String roar() {
        return "RRRRR!!";
    }

    public String attack() {
        return "I am causing damage";
    }

    public String move() {
        return "";
    }

}


