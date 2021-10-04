/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

import java.util.Scanner;

public class Solution25 {
    public static final Scanner sc = new Scanner(System.in);
    // Use Password class

    public static void main(String[] args) {
        //prompt user for password
        String password;
        System.out.println("Enter you password:");
        password = sc.nextLine();
        //send password to new password class
        PasswordCheck p = new PasswordCheck(password);
        //Password class with return strength output string
    }
}
