/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

public class Solution32 {

    /*
    Exercise 32 - Guess the Number Game

    Prompt for the difficulty level, and then start the game. The computer picks a random number in that range and
prompts the player to guess that number. Each time the player guesses, the computer should give the player a
hint as to whether the number is too high or too low. The computer should also keep track of the number of
guesses. Once the player guesses the correct number, the computer should present the number of guesses
and ask if the player would like to play again.

Constraints
• Don’t allow any non-numeric data entry.
• During the game, count non-numeric entries as wrong guesses.
     */
    static int difficulty;
    static int winningNumber;
    static int guessCounter;
    static int maxGuess;

    public static void main(String[] args) {

        //set the difficulty level
        setDifficulty();

        //pick random winning number
        setWinningNumber(difficulty);

        //launch guessing game with winning number and difficulty level
        guessingGame();

        //prompt for first guess

        while(true){
            //nextLine to guess();
            //if true
            break;

        }
        //output you got it in guesses
        getGuessCount();
    }
}
