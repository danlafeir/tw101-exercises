package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by dan on 6/8/15.
 */
public class Troll implements Monster {
    int hitPoints;
    String name;

    Troll(String name){
        this.hitPoints = 40;
        this.name = name;
    }

    @Override
    public int currentHitpoints() {
        return hitPoints;
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount/2;
        if(hitPoints < 0){
            hitPoints = 0;
        }
    }

    @Override
    public String name() {
        return name;
    }
}
