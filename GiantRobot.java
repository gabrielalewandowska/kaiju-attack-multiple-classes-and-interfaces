package com.example.user.monsterattack;

/**
 * Created by user on 06/09/2017.
 */

public class GiantRobot extends Kaiju {
    public GiantRobot(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar() {
        return super.roar() + " I am a giant robot!";
    }

    public String move() {
        return "THUMP!";
    }

    @Override
    public void getDamaged(int damageTaken) {
        this.healthValue -= damageTaken;
    }

}
