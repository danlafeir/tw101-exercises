package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by dan on 6/8/15.
 */
public class GuessingGame {
    protected int randomNumberToGuess;
    protected Scanner inStream;

    public enum ResultOfGuess { EXACT, TOO_HIGH, TOO_LOW }

    public GuessingGame(){
        randomNumberToGuess = generateRandomNumber1to100();
        inStream = new Scanner(System.in);
    }

    public void playGame(){
        System.out.println("The number to guess: "+ randomNumberToGuess);
        while(guessANumber(grabAGuessFromUser()) != ResultOfGuess.EXACT){}
        System.out.println("End of game");
    }

    protected int grabAGuessFromUser() {
        System.out.print("Submit a guess: ");
        return inStream.nextInt();
    }

    protected ResultOfGuess guessANumber(double number){
        if(number > randomNumberToGuess){
            System.out.println("Guess is too high");
            return ResultOfGuess.TOO_HIGH;
        }
        else if(number < randomNumberToGuess){
            System.out.println("Guess is too low");
            return ResultOfGuess.TOO_LOW;
        }
        else{
            return ResultOfGuess.EXACT;
        }
    }

    protected int generateRandomNumber1to100() {
        return (int)(Math.random() * 100) + 1;
    }

}
