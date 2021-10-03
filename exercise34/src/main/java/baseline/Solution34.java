/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

import java.util.Scanner;

public class Solution34 {

    private static final Scanner sc = new Scanner(System.in);

    /*
    Create a small program that contains a list of employee names. Print out the list of names when the program
runs the first time. Prompt for an employee name and remove that specific name from the list of names. Display
the remaining employees, each on its own line.

Constraint
• Use an array or list to store the names.
     */

     public static void main(String[] args) {
        String[] employeeList = new String[]{"Lara Croft","Lisbeth Salander","Natasha Romanoff","Sarah Connor","Ellen Ripley"};
        //new employee list with hard coded array
        EmployeeList e = new EmployeeList(employeeList);
        //print initial list
         System.out.println(e.toString());
        //prompt employee for name to remove
        System.out.print("Which of these badass women do you want to remove?");
        String removePerson = sc.nextLine();

        //find index matching remove command
        int removeIndex = e.findRemoveIndex(removePerson);
         //remove name from index;
         e.removeEmployee(removeIndex);
         //print out new/remaining list
         System.out.println(e.toString());
    }
}
