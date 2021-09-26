/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

/*
Exercise 25 - Password Strength Indicator
Functions help you abstract away complex operations, but they also help you build reusable components.
Create a program that determines the complexity of a given password based on these rules:
• A very weak password contains only numbers and is fewer than eight characters.
• A weak password contains only letters and is fewer than eight characters.
• A strong password contains letters and at least one number and is at least eight characters.
• A very strong password contains letters, numbers, and special characters and is at least eight characters.
If a password does not meet any of these rules, then report it as a password of unknown strength.
Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.
Constraints
• Create a passwordValidator function that takes in the password as its argument and returns a numeric value
you can evaluate to determine the password strength.
• Use a single output statement.
 */

public class Solution25 {
    public static void main(String[] args) {
//prompt user for password
        static String password;

        //check if all numbers
        allNumbers();

        //check is fewer than 8 char
        underEightChar();

        //check if all letters
        allLetters();

        //check if special char
        hasSpecialChar();

        //check password strength
        passwordValidator();

        passwordStrength();

    }

    public static String passwordStrength() {
        //convert numeric passValidator int to strength string
        return strengthString;
    }

    public static int passwordValidator(String password) {
        //add number values for each parameter
        //all numbers = 0 : 1
        //fewer than 8 char = 0 : 1
        //all letters = 1 : 2
        //special char = 1 : 0
        //allNUm + fewEight = 0 - V. weak
        //allLet = fewEight = 1 - weak
        //notAllNum + notAllLet + eightPlus = 4 - strong
        //notAllNum + notAllLet + eightPlus + SpecChar = 5 - v strong
        return 0;

    }

    public static boolean allNumbers() {
        //check if all numbers
        return true;
    }

    public static boolean underEightChar(String string) {
        //check char count
        return true;
    }

    public static boolean allLetters(String string) {
        //chekc for all letters
        return true;
    }

    public static boolean hasSpecialChar(String string) {
        //search string for special character
        return true;
    }
}
