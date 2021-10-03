/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */
package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution33 {

    public static final Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    /*
    Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask
again later."

Constraint
• The value should be chosen randomly using a pseudo random number generator. Store the possible
choices in a list and select one at random.
     */
    //array to hold possible responses and hard code responses
    private String[] responses = new String[]{"Absolutely!","Fat Chance!","Eh, who knows?","Beep boop I AM ROBOT GROOT"};
    private int responseNumber;

    public static void main(String[] args) {

        //prompt user for question
        System.out.println("What is your question?");
        //read question, do nothing with it
        sc.next();
        //new solution object to run magic 8 ball
        Solution33 s = new Solution33();
        //get random number 0-3
        s.setResponseNumber();
        //output response
        String output = s.responseOutput(s.responseNumber);
        System.out.println(output);

    }

    private void setResponseNumber() {
        //random number 0-3//set to class var responseNumber
        this.responseNumber = rand.nextInt(4);

    }

    public String responseOutput(int responseNumber) {
        //take in response number
        //return array index
       return responses[responseNumber];
    }
}
