/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

public class Solution34 {

    /*
    Create a small program that contains a list of employee names. Print out the list of names when the program
runs the first time. Prompt for an employee name and remove that specific name from the list of names. Display
the remaining employees, each on its own line.

Constraint
• Use an array or list to store the names.
     */

    //create array to hold employee list
    private String[] employeeList = new String[5];

    //hard code employees to array

    public static void main(String[] args) {

        //prompt employee for name to remove

        //find index matching remove command
        findRemoveIndex();

        //remove name from index;


    }
}
