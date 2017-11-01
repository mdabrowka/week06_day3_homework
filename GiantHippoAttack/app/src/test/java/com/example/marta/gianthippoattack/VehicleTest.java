package com.example.marta.gianthippoattack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by marta on 01/11/2017.
 */

public class VehicleTest {

    Tank tank;
    DeadlyRaft raft;

    @Before
    public void before() {
        tank = new Tank();
        raft = new DeadlyRaft();
    }

    @Test
    public void canAttackHippo() {
        assertEquals("Grinding with my wheels", tank.attackHippo());
        assertEquals("Drowning with my weight", raft.attackHippo());
    }


}
