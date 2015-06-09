package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by dan on 6/8/15.
 */
public class Orc implements Monster {
    int hitPoints;
    String name;

    Orc(String name){
        this.hitPoints = 20;
        this.name = name;
    }

    @Override
    public int currentHitpoints() {
        return hitPoints;
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount;
        if(hitPoints < 0){
            hitPoints = 0;
        }
    }

    @Override
    public String name() {
        return name;
    }
}
