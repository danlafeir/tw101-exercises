package com.thoughtworks.tw101.exercises.exercise8;

import com.thoughtworks.tw101.exercises.exercise7.GuessingGame;

import java.util.ArrayList;

/**
 * Created by dan on 6/8/15.
 */
public class GuessingGameWithMemory extends GuessingGame {
    ArrayList<Integer> previousGuesses;

    public GuessingGameWithMemory(){
        super();
        previousGuesses = new ArrayList<>();
    }

    @Override
    protected int grabAGuessFromUser() {
        System.out.print("Submit a guess: ");
        int guess = inStream.nextInt();
        previousGuesses.add(guess);
        return guess;
    }

    public void printOutPreviousGuesses(){
        System.out.println("The user's previous guesses:");
        for(int guess : previousGuesses){
            System.out.println(guess);
        }
    }
}
