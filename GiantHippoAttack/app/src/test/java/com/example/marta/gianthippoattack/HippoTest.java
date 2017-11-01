package com.example.marta.gianthippoattack;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by marta on 01/11/2017.
 */

public class HippoTest {
    @Test
    public void attack() throws Exception {

    }

    FatHippo fat;
    PygmyHippo pygmy;

    @Before
    public void before() {
        fat = new FatHippo();
        pygmy = new PygmyHippo();
    }


    @Test
    public void canRoar() {
        assertEquals("RRRRR!!", fat.roar());
        assertEquals("RRRRR!!", pygmy.roar());
    }

    @Test
    public void canAttack() {
        assertEquals("I am causing damage", fat.attack());
        assertEquals("I am causing damage", pygmy.attack());
    }

    @Test
    public void canMove() {
        assertEquals("Treading heavily", fat.move());
        assertEquals("Trotting towards destruction", pygmy.move());
    }


}






