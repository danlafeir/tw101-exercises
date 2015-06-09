package com.thoughtworks.tw101.exercises.exercise6;

// Exercise #6: Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
// String name(), and int currentHitpoints() methods. Store instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage. After you have damaged all of the monsters,
// report the name and current hit points of all monsters.
// * Orcs are named “Orc” and have 20 initial hitpoints
// * Trolls are named “Troll”, have 40 hit points and only take half damage

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Monster> listOfMonsters = new ArrayList<>();
        listOfMonsters.add(new Orc("Henry Orc"));
        listOfMonsters.add(new Orc("Tommy Orc"));
        listOfMonsters.add(new Troll("Johnny Troll"));
        listOfMonsters.add(new Troll("Daren Troll"));

        for(Monster monster : listOfMonsters){
            monster.takeDamage(10);
        }

        for(Monster monster : listOfMonsters){
            System.out.println(monster.name()+" has "+monster.currentHitpoints()+" hitpoints");
        }
    }
}
