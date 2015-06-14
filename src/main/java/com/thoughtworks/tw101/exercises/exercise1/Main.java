package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {


    public static final int STARTING_ODD_VALUE = 1;
    public static final int ENDING_VALUE = 100;

    public static void main(String[] args) {
        int sumOfOddNumbers = 0;
        for(int index = STARTING_ODD_VALUE; index < ENDING_VALUE; index += 2){
            System.out.println(index);
            sumOfOddNumbers += index;
        }
        System.out.println("The sum of the odd numbers is: " + sumOfOddNumbers);
    }
}
