package com.example.marta.gianthippoattack;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by marta on 01/11/2017.
 */

public class HippoTest {
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



}






