/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution36 {

    private static final Scanner sc = new Scanner(System.in);

    //make class constructor with array input for testing
    public Solution36(ArrayList<Integer> numberArray){
        this.numberArray = numberArray;
    }
    //make empty constructor or main run use
    public Solution36(){

    }


    /*
    Write a program that prompts for response times from a website in milliseconds. It should keep asking for
values until the user enters done.
The program should print the average time (mean), the minimum time, the maximum time, and the population
standard deviation.

Constraints
• Create functions called average , max , min , and std , which take in a list of numbers and return the results.
• Use loops and arrays to perform the input and mathematical operations.
• Be sure to exclude the "done" entry from the inputs.
• Be sure to properly ignore any invalid inputs.
• Keep the input separate from the processing and the output.
     */

    //integer arrayList to store inputs
    private ArrayList<Integer> numberArray = new ArrayList<>();


    public static void main(String[] args) {
        //create class to run non-static methods
        Solution36 s = new Solution36();
        s.inputArray();
        System.out.println(s);

    }

    //input numbers to array
    public void inputArray() {
        while(true){
            //prompt user for number input
            System.out.print("Enter a number:");
            String input = sc.nextLine();
            //check if done, exit
            if (input.equals("done")) break;
            try{//parse input to int - input should not be float type, unrealistic number precision
                int numberInput = Integer.parseInt(input);
                numberArray.add(numberInput);
            }//if not number ignore and wait for number input
            catch (NumberFormatException e){
                System.out.println("Integer number input only\n");
            }
        }
    }

    //average function
    public double average(List<Integer> avgArray) {
        //loop to count number of inputs and add inputs
        int sum = 0;

        for (Integer o : avgArray) {
            sum += o;
        }
        if (avgArray.isEmpty()) return 0;

        return (double)sum / avgArray.size();
    }

    //max function
    public int max(List<Integer> maxArray) {
        //set int max = 0
        int max = maxArray.get(0);
        //loop through array, if bigger than max, set max equal
        for (int i=1; i < maxArray.size(); i++){
            max = (maxArray.get(i) > max ? maxArray.get(i) : max);
        }
        return max;
    }

    //min function
    public int min(List<Integer> minArray) {
        //set int min = to first array value numberArray[0]
        int min =minArray.get(0);
        //loop through array, if less than max, set max equal
        for (int i=1; i < minArray.size(); i++){
            min = (minArray.get(i) < min ? minArray.get(i) : min);
        }
        return min;
    }

    //std deviation function
    public double std(List<Integer> stdArray) {
        //std deviation = sqrt ( sum ( i - array.average ) ^ 2 / array.length )
        //find avg
        double avg = average(stdArray);
        //sum of (number - avg)^2
        int sum = 0;
        for (Integer integer : stdArray) {
            sum += Math.pow((integer - avg), 2);
        }
        return Math.pow((double) sum / stdArray.size(),0.5);

    }

    public String toString(){
        return String.format("Numbers: %s%nThe average is %.2f%nThe minimum is %d%nThe maximum is %d%nThe standard deviation is %.2f",
                numberArray.toString(),average(numberArray),min(numberArray),max(numberArray),std(numberArray));
    }



}
