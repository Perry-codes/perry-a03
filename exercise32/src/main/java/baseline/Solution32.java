/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

import java.util.Scanner;

public class Solution32 {

    public static final Scanner sc = new Scanner(System.in);

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

   public static void main(String[] args) {
       //boolean for play cycle at end
       boolean play = true;
        while (play){

            //set the difficulty level
            System.out.print("Enter the difficulty level (1, 2, or 3):");
            try{
                int difficulty = sc.nextInt();

           if(1 == difficulty) {
               //launch game class with diff 1
               GuessingGame game = new GuessingGame(1);
               //prompt to play again
               play = game.playAgain();
           }else if (2 == difficulty){
               //launch game class with diff 2
               GuessingGame game = new GuessingGame(2);
               //prompt to play again
               play = game.playAgain();
           }else if (3 == difficulty){
               //launch game class with diff 3
               GuessingGame game = new GuessingGame(3);
               //prompt to play again
               //prompt to play again
               play = game.playAgain();
           } else {
               System.out.print("Invalid difficulty entry!\n\nDo you want to play again (y/n)");
               play = sc.nextLine().equals("y") || sc.nextLine().equals("Y");
           }
            }catch(NumberFormatException e){
                System.out.print("Invalid difficulty entry!\n\nDo you want to play again (y/n)");
                play = sc.nextLine().equals("y") || sc.nextLine().equals("Y");
            }

        } sc.nextLine(); sc.close();
    }
}
