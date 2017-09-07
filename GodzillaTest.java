package com.example.user.monsterattack;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by user on 06/09/2017.
 */

public class GodzillaTest {
    Godzilla godzilla;

    @Before
    public void before(){
        godzilla = new Godzilla("Freddie", 100, 30);
    }

    @Test
    public void testGetName(){
        assertEquals("Freddie", godzilla.getName());
    }

    @Test
    public void testGetHealthValue(){
        assertEquals(100, godzilla.getHealthValue());
    }

    @Test
    public void testGetAttackValue(){
        assertEquals(30, godzilla.getAttackValue());
    }

    @Test
    public void testRoar(){
        assertEquals("Roar! I am a big godzilla!", godzilla.roar());
    }
}
