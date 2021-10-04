package baseline;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    private static final Scanner sc = new Scanner(System.in);
    private final Random rand = new Random();
    private int difficulty;
    public int winningNumber; //set public for testing
    private int guessCount;

    //class constructor to launch class with difficulty set
    public GuessingGame(int difficulty){
        //set difficulty from input
        this.difficulty = difficulty;
        //start guess count at 0
        this.guessCount = 0;
    }

    public void setWinningNumber() {
        int max;
        if(difficulty == 1) max = 10;
        else if(difficulty == 2) max = 100;
        else max = 1000;
        this.winningNumber = rand.nextInt(max)+ 1;
        System.out.print("I have my number. What's your guess?");
    }

    public void guess() {
        while (true) {
            //guess count +1
            guessCount++;
            String guessString = sc.nextLine();
            //try to parse input string to int
            try {
                int guessNum = Integer.parseInt(guessString);
                //if parse and matches winning num - output yay return true
                if(guessNum == winningNumber){
                    System.out.println("You Guessed It!");
                    break;
                }//if parse and no match output high or low and return false
                else if(guessNum < winningNumber){
                    System.out.print("Too low, guess again:");
                }else System.out.print("Too high, guess again:");
            }//catch format exception and return "bad input" and false
            catch (NumberFormatException e) {
                System.out.print("Invalid input, guess again:");
            }
        }
    }

    public int getGuessCount(){
        return guessCount;
    }

    public boolean playAgain(){
        System.out.print("\nDo you want to play again (y/n)");
        String playAgain = sc.nextLine();
        return playAgain.equals("y") || playAgain.equals("Y");
    }
}
