/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

import java.util.Scanner;

public class Solution28 {

    //solution class for testing
    public void Solution28(){

    }

    /*
    Write a program that prompts the user for five numbers and computes the total of the numbers.

    Constraints
• The prompting must use repetition, such as a counted loop, not three separate prompts.
     */
    //Scanner for user input
    public static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        //use array to store 5 numbers
        double[] array = new double[5];
        //create loop
        //while less than 5 prompt user for number
        //save input into array
        int i =0;
        while (i < 5){
            //prompt for input
            System.out.print("Enter a number:");
            if(sc.hasNextDouble()){
                array[i] = sc.nextDouble();
                i++;
            } else sc.next();
        }
        //send array to add function
        //new solution class to use non static methods
        Solution28 s = new Solution28();
        //addNumbers(fiveNumberArray);
        System.out.printf("The total is %.2f.",s.addNumbers(array));

    }

    public double addNumbers(double[] fiveNumberArray) {
        //loop to add array values
        int sum = 0;
        for (double v : fiveNumberArray) {
            sum += v;
        }
        return sum;
    }
}
