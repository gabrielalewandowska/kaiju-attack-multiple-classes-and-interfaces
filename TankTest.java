package com.example.user.monsterattack;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by user on 06/09/2017.
 */

public class TankTest {
    Tank tank;

    @Before
    public void before(){
        tank = new Tank("tank", 100);
    }

    @Test
    public void testGetType(){
        assertEquals("tank", tank.getType());
    }

    @Test
    public void testGetHealthValue(){
        assertEquals(100, tank.getHealthValue());
    }
}
