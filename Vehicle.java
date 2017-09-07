package com.example.user.monsterattack;

/**
 * Created by user on 06/09/2017.
 */

public abstract class Vehicle implements Damageable{
    String type;
    int healthValue;

    public Vehicle(String type, int healthValue){
         this.type = type;
         this.healthValue =  healthValue;
    }

    public String getType(){
        return type;
    }

    public int getHealthValue(){
        return this.healthValue;
    }

    public void setHealthValue(int newValue){
        this.healthValue = newValue;
    }

    public void getDamaged (int damageTaken) {
        int result = this.healthValue - damageTaken;
        this.setHealthValue(result);
    }



}
