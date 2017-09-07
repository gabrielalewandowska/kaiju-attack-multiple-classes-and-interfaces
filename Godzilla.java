package com.example.user.monsterattack;

/**
 * Created by user on 06/09/2017.
 */

public class Godzilla extends Kaiju{

    public Godzilla(String name, int healthValue, int attackValue) {
        super(name, healthValue, attackValue);
    }

    public String roar(){
        return super.roar() + " I am a big godzilla!";
    }

    public String move(){
        return "STAMP!";
    }

    @Override
    public void getDamaged(int damageTaken) {
        this.healthValue -= damageTaken;
    }

}
