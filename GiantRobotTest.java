package com.example.user.monsterattack;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by user on 06/09/2017.
 */

public class GiantRobotTest {
    GiantRobot giantRobot;
    Tank tank;

    @Before
    public void before(){
        giantRobot = new GiantRobot("Steve", 100, 50);
        tank = new Tank("tank", 100);
    }

    @Test
    public void testGetName(){
        assertEquals("Steve", giantRobot.getName());
    }

    @Test
    public void testGetHealthValue(){
        assertEquals(100, giantRobot.getHealthValue());
    }

    @Test
    public void testGetAttackValue(){
        assertEquals(50, giantRobot.getAttackValue());
    }

    @Test
    public void testRoar(){
        assertEquals("Roar! I am a giant robot!", giantRobot.roar());
    }

    @Test
    public void testGetDamaged(){
        giantRobot.getDamaged(30);
        assertEquals(70, giantRobot.getHealthValue());
    }

    @Test
    public void testCanAttack(){
        giantRobot.attack(tank);
        assertEquals(50, tank.getHealthValue());
    }
}
