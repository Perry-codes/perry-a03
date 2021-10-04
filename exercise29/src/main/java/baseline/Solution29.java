/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

import java.util.Scanner;

public class Solution29 {
    //Scanner for input
    private static final Scanner sc = new Scanner(System.in);

    public Solution29(){
        //solution object for testing non static methods
    }

    public static void main(String[] args) {
        Solution29 s = new Solution29();
        //use input function to take and validate input
        double rateOfReturn = s.userRateofReturn();
        //send ror to formula
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
                //loop for new input if not, return rate if valid
                if (input != 0) return input;
                else System.out.println("Invalid input.");
            }else{
                System.out.println("Invalid input.");
                sc.nextLine();
            }
        }
    }

    public int yearsToDouble(double rateOfReturn) {
        //years = 72 / r
        return (int) Math.ceil(72 / rateOfReturn);
    }
}
