package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by dan on 6/8/15.
 */
public interface Monster {
    void takeDamage(int amount);
    String name();
    int currentHitpoints();
}
