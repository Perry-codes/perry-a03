/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

import java.util.Scanner;

public class Solution29 {
    //Scanner for input
    private static final Scanner sc = new Scanner(System.in);

    //solution object for testing non static methods
    public void Solution29(){

    }
    /*
    Write a quick calculator that prompts for the rate of return on an investment and calculates how many years it
will take to double your investment.
The formula is
years = 72 / r
where r is the stated rate of return.

Constraints
• Don’t allow the user to enter 0.
• Don’t allow non-numeric values.
• Use a loop to trap bad input, so you can ensure that the user enters valid values.
     */
    public static void main(String[] args) {
        Solution29 s = new Solution29();
        //use input function to take and validate input
        //r =
        double rateOfReturn = s.userRateofReturn();

        //send r to formula
        int years = s.yearsToDouble(rateOfReturn);

        //output
        System.out.printf("It will take %d years to double your initial investment",years);

    }

    public double userRateofReturn() {
        //prompt user for rate of return
        while (true) {
            System.out.print("What is the rate of return?");
            //check that the input is valid
            if(sc.hasNextDouble()) {
                double input = sc.nextDouble();
                if (input != 0) return input;
                else System.out.println("Invalid input.");
            }else{
                System.out.println("Invalid input.");
                sc.nextLine();
            }
        }

        //loop for new input if not, return rate if valid
    }

    public int yearsToDouble(double rateOfReturn) {
        //years = 72 / r
        int years = (int) Math.ceil(72 / rateOfReturn);
        return years;

    }
}
