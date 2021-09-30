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

        //
    }

    private static void setDifficulty() {
        //prompt user for difficulty 1,2,3
        //do, while loop to make sure input is 1,2,or3
        difficulty = input;
        //maxGuess = 10,100,1000;
    }

    public static int setWinningNumber(int difficulty) {
        //return random int to the difficult level digits
        /*The first level of difficulty would be a number
between 1 and 10. The second difficulty set would be between 1 and 100. The third difficulty set would be
between 1 and 1000.*/
        return 0;
    }

    private static void guessingGame() {
        //prompt user for guess
        //do while loop to re-prompt if not between 1 and max
        //check if guess is correct
        guessCheck();
    }

    public static boolean guessCheck() {
        //increment guessCounter++
        //guess is winning number?
        return true;
    }
}
