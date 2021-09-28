/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

public class Solution31 {
static int restingPulse;
static int age;
    /*
    The Karvonen heart rate formula is one method you can use to determine your rate. Create a program
that prompts for your age and your resting heart rate. Use the Karvonen formula to determine the target heart
rate based on a range of intensities from 55% to 95%. Generate a table with the results as shown in the
example output. The formula is
TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

Constraints
• Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
• Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without
entering valid inputs.
• Display the results in a tabular format.

     */
    public static void main(String[] args) {

        //prompt user for resting pulse, use function to verify input
        restingPulse = inputPulse();
        //prompt user for age, use function to verify input
        age = inputAge();

        //create output table
        karvonenHRTable();

    }



    private static int inputAge() {
        //do: ask for input
        //while: input is not int
        //return int
        return 0;
    }

    private static int inputPulse() {
        //do: ask for input
        //while: input is not int
        //return int
        return 0;
    }

    public static void karvonenHRTable() {
        //loop starting at 55 up by 5 till 95
        //intensity - calculate HR
        karvonenHR();
    }

    public static int karvonenHR() {
        //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        return 0;
    }
}
