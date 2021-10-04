/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

import java.util.Scanner;

public class Solution26 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //prompt for balance
        System.out.print("What is the balance?");
        double balance = sc.nextDouble();

        //prompt for apr
        System.out.print("What is the APR on the card (as a percent)?");
        double apr = sc.nextDouble();

        //prompt payment
        System.out.print("What is the monthly payment you can make?");
        double monthlyPayment = sc.nextDouble();

        //New payment object
        PaymentCalculator p = new PaymentCalculator(apr,balance,monthlyPayment);

        System.out.printf("It will take you %d months to pay off this card.",p.calculateMonthsUntilPaidOff());
    }
}
