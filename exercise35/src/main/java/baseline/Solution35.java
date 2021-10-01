/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

import static com.sun.tools.classfile.Module_attribute.RequiresEntry.length;

public class Solution35 {

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
    private String[] contestants = new String[];
    private int winnerIndex;


    //populate array
    private void inputContestants() {
        //loop do while
        //prompt for contestant name
        //if blank, exit, dont add blank
    }

    //pick random number from 0 to array.length-1
    public void pickWinningNumber(int maxNum) {
        //get random number
        //set wining index variable
    }

    private void output() {
        //output string with winner
    }


    public static void main(String[] args) {

    }
}
