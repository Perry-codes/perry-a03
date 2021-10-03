/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {

    private static final Scanner sc = new Scanner(System.in);
    private static final Random rand = new Random();

    public Solution35(){
        //allow class instance creation to use non-static methods
    }
    /*
    Create a program that picks a winner for a contest or prize drawing. Prompt for names of contestants until the
user leaves the entry blank. Then randomly select a winner.

Constraints
• Use a loop to capture user input into an array.
• Use a random number generator to pluck a value from the array.
• Don’t include a blank entry in the array.
• Some languages require that you define the length of the array ahead of time. You may need to find another
data structure, like an ArrayList.
     */

    //var array for names
    public ArrayList<String> contestants = new ArrayList<>();


    public static void main(String[] args) {
        //new class to run non-static methods
        Solution35 s = new Solution35();

        s.inputContestants();

        int numContestants =  s.contestants.size();
        int winningNumber = s.pickWinningNumber(numContestants);

        System.out.println(s.output(winningNumber));

    }

    //populate array
    private void inputContestants() {

        //loop do while
        while(true){
            //prompt for contestant name
            //if blank, exit, dont add blank
            System.out.print("Enter a name:");
            String name = sc.nextLine();
            if(name.equals("")) {
                break;
            }
            contestants.add(name);
        }
        contestants.remove("");
        contestants.trimToSize();
    }

    //pick random number from 0 to array.length-1
    private int pickWinningNumber(int maxNum) {
        //get random number
        //set wining index variable
        return rand.nextInt(maxNum);
    }

    public String output(int winnerIndex) {
        //output string with winner
        //array list uses get(index)
        return String.format("The winner is..... %s!",contestants.get(winnerIndex));
    }



}
