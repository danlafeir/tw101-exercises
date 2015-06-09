package com.thoughtworks.tw101.exercises.exercise2;

// Exercise #2: Create a class that counts how many times you call the method increment() and prints out that number
// when you call total(). Create a main method that calls increment() 5 times and then calls total().

public class Accumulator {
    private int counter = 0;

    public void increment(){
        counter++;
    }

    public void total(){
        System.out.println(counter);
    }
}
