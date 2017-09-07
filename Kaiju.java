package com.example.user.monsterattack;

/**
 * Created by user on 06/09/2017.
 */

public abstract class Kaiju implements Damageable, CanAttack{
    String name;
    int healthValue;
    int attackValue;

        public Kaiju(String name, int healthValue, int attackValue){
            this.name = name;
            this.healthValue = healthValue;
            this.attackValue = attackValue;
        }


        public String getName(){
            return this.name;
        }

        public int getHealthValue(){
            return this.healthValue;
        }
        public int getAttackValue(){
            return this.attackValue;
        }

        public String roar(){
            return "Roar!";
        }

        public void attack(Damageable target){
            target.getDamaged(this.attackValue);
        }

        public void setHealthValue(int newValue){
            this.healthValue = newValue;
        }

        public void getDamaged (int damageTaken) {
            int result = this.healthValue - damageTaken;
            this.setHealthValue(result);
        }

        public abstract String move();
}