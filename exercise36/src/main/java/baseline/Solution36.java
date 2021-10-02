/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

public class Solution36 {

    //make class constructor with array input for testing
    public Solution36(int[] numberArray){
        this.numberArray = numberArray;
    }


    /*
    Write a program that prompts for response times from a website in milliseconds. It should keep asking for
values until the user enters “done.”
The program should print the average time (mean), the minimum time, the maximum time, and the population
standard deviation.

Constraints
• Create functions called average , max , min , and std , which take in a list of numbers and return the results.
• Use loops and arrays to perform the input and mathematical operations.
• Be sure to exclude the "done" entry from the inputs.
• Be sure to properly ignore any invalid inputs.
• Keep the input separate from the processing and the output.
     */

    //integer array to store inputs
    private int[] numberArray = new int[];
    //double variables for avg and std deviation
    private double arrayAvg;
    private double stdDeviation;
    //interger variables for min and max
    private int arrayMin;
    private int arrayMax;

    //input numbers to array
    public void inputArray() {
        //prompt user for number input
        //check if done, exit
        //if not number ignore and wait for number input
        //
    }

    //average function
    public void average() {
        //loop to count number of inputs and add inputs
        int counter;
        int sum;
        this.arrayAvg = sum / counter;
    }

    //max function
    public void max() {
        //set int max = 0
        int max =0;
        //loop through array, if bigger than max, set max equal
        this.arrayMax = max;
    }

    //min function
    public void min() {
        //set int min = to first array value numberArray[0]
        int min;
        //loop through array, if less than max, set max equal
        this.arrayMax = min;
    }

    //std deviation function
    public void std() {
        //std deviation = sqrt ( sum ( i - array.average ) ^ 2 / array.length )


    }




    public static void main(String[] args) {

    }
}
