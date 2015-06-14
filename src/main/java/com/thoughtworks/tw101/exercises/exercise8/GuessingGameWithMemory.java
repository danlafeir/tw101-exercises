package com.thoughtworks.tw101.exercises.exercise8;

import com.thoughtworks.tw101.exercises.exercise7.GuessingGame;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dan on 6/8/15.
 */
public class GuessingGameWithMemory extends GuessingGame{
    ArrayList<Integer> previousGuesses;

    public GuessingGameWithMemory(){
        super();
        previousGuesses = new ArrayList<>();
    }

    @Override
    protected int grabAGuessFromUser() {
        System.out.print("Submit a guess: ");

        try {
            int guess = Integer.parseInt(inStream.nextLine());
            previousGuesses.add(guess);
            return guess;
        }
        catch (NumberFormatException e){
            System.out.println("That is not a number please guess again");
            return 0;
        }

    }

    public void printOutPreviousGuesses(){
        System.out.println("The user's previous guesses:");
        for(int guess : previousGuesses){
            System.out.println(guess);
        }
    }
}
