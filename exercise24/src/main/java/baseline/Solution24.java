/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {

    //String variable
    private final String inputString;
    //Create scanner
    private static final Scanner sc =  new Scanner(System.in);

    //class constructor
    public Solution24(String inputString){
        this.inputString = inputString;
    }

    public String toString(){
        return this.inputString;
    }

    public static void main(String[] args) {

        //prompt user for string1
        System.out.println("Anagram Checker\nEnter first string:");
        //make string object 1
        String input1 = sc.nextLine();
        Solution24 s1 = new Solution24(input1);
        //prompt user for string2
        System.out.println("Enter second string:");
        //make string object 2
        String input2 = sc.nextLine();
        Solution24 s2 = new Solution24(input2);
        //check with isAnagram
        Boolean anagram = s1.isAnagram(s1.inputString, s2.inputString);

        if(anagram){
            System.out.printf("\"%s\" and \"%s\" are anagrams",s1.inputString,s2.inputString);
        }else{
            System.out.printf("\"%s\" and \"%s\" are not anagrams",s1.inputString,s2.inputString);
        }

    }

    public Boolean isAnagram(String inputString1, String inputString2) {
        //check if sorted
        return sortString(inputString1).equals(sortString(inputString2));

    }

    public String sortString(String inputString) {
        //remove spaces
        String noSpace = inputString.replace(" ","");
        //set all letters to lowercase
        String allLower = noSpace.toLowerCase();
        //sort remaining with temp character array and sort function
        char[] tempArray = allLower.toCharArray();
        Arrays.sort(tempArray);

        return new String(tempArray);
    }
}
