/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;
/*
Exercise 24 - Anagram Checker
Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to
maintain.
Create a program that compares two strings and determines if the two strings are anagrams. The program
should prompt for both input strings and display the output as shown in the example that follows.
Example Output
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.
Constraints
• Implement the program using a function called isAnagram , which takes in two words as its arguments and
returns true or false.

 */
public class Solution24 {
    public static void main(String[] args) {

        //prompt user for string1
        //prompt user for string2
        //remove spaces and sort strings
        sortString(String string1);
        sortString();
        //check with isAnagram
        isAnagram();

    }

    public static Boolean isAnagram() {

    }

    public static String sortString(String string1, String string2) {
        //remove spaces
        //set all letters to lowercase
        //sort remaining
    }
}
