package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public static final int DISTANCE_BETWEEN_NUMBERS = 2;

    public int of(int start, int end) {
        int sumOfOddNumbers = 0;
        if (checkIfNumberIsNotOdd(start)) {
            start++;
        }
        for(int index = start; index < end; index += DISTANCE_BETWEEN_NUMBERS){
            sumOfOddNumbers += index;
        }
        return sumOfOddNumbers;
    }

    private boolean checkIfNumberIsNotOdd(int numberToCheck ){ return (numberToCheck % 2 == 0); }
}
