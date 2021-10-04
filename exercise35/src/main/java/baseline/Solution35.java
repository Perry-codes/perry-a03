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
    public ArrayList<String> contestants = new ArrayList<>();

    public Solution35(){
        //allow class instance creation to use non-static methods
    }

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
        //loop while
        while(true){
            //prompt for contestant name
            System.out.print("Enter a name:");
            String name = sc.nextLine();
            //if blank, exit, dont add blank
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
