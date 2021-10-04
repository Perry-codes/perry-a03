/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

import java.util.Scanner;

public class Solution31 {
    public static final Scanner sc = new Scanner(System.in);
    private int restingPulse;
    private int age;

    //class constructor
    public Solution31(){
        this.restingPulse = inputPulse();
        this.age = inputAge();
    }
    //alt constructor for hard coding test values
    public Solution31(int restingPulse, int age){
        this.restingPulse = restingPulse;
        this.age = age;
    }

    public static void main(String[] args) {
        Solution31 s = new Solution31();
        //class constructor prompts for restingPulse and age

        //print table
        s.karvonenHRTable();


    }

    private int inputAge() {
        //do: ask for input
        //while: input is not int
        while (true) {
            //prompt for age
            System.out.print("What is your age?");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
                //return int
                return age;
            } else {
                System.out.println("Integer year age please.");
                sc.nextLine();
            }
        }
    }

    private int inputPulse () {
        //do: ask for input
        //while: input is not int
        while (true) {
            //prompt for age
            System.out.print("What is your resting heart rate?");
            if (sc.hasNextInt()) {
                restingPulse = sc.nextInt();
                //return int
                return restingPulse;
            } else {
                System.out.println("Integer heart rate please.");
                sc.nextLine();
            }
        }
    }

    private void karvonenHRTable () {
        //create output table
        //output header
        System.out.printf("Intensity   | Rate    %n------------|---------%n");
        //create new rows
        for( int i = 55; i < 100; i += 5){
            System.out.printf("%-11s | %s%n",i + "%",karvonenHR(i));
        }
    }

    public String karvonenHR ( int intensity){
        //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        int targetHeartRate =(int) (((220 - age) - restingPulse) * intensity/100.0) + restingPulse;

        return String.format("%d bpm",targetHeartRate);
    }
}
