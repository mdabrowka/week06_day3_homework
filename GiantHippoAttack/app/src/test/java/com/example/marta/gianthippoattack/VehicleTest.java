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
    public void canAttackHippoDeadly() {
        assertEquals("Grinding with my wheels", tank.attackHippoDeadly());
        assertEquals("Drowning with my weight", raft.attackHippoDeadly());
    }

    @Test
    public void canAttackHippoNonDeadly() {
        assertEquals("Making scary noises", tank.attackHippoNonDeadly());
        assertEquals("Throwing logs of wood", raft.attackHippoNonDeadly());
    }

}
