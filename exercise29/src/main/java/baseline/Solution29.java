/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

public class Solution29 {
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
        //use input function to take and validate input
        //r =
        userRateofReturn();

        //send r to formula
        yearsToDouble();

    }

    public static double userRateofReturn() {
        //prompt user for rate of return
        //check that the input is valid
        //loop for new input if not, return rate if valid
    }

    public static void yearsToDouble() {
        //years = 72 / r
        //output "It will take {year} years to double your initial investment"
    }
}
