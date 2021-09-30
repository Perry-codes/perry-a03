/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */
package baseline;

public class Solution33 {

    /*
    Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask
again later."

Constraint
• The value should be chosen randomly using a pseudo random number generator. Store the possible
choices in a list and select one at random.
     */
    //array to hold possible responses
    static String[] responses = new String[4];
    //hard code responses
    static int responseNumber;

    public static void main(String[] args) {

        //prompt user for question

        //get random number 0-3
        setResponseNumber();
        //output response
        responseOutput(responseNumber);

    }

    private static void setResponseNumber() {
        //random number 0-3
        //set to class var responseNumber
    }

    public static void responseOutput(int responseNumber) {
        //take in response number
        //return array index
    }
}
