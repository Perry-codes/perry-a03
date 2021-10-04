/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

import java.util.Scanner;

public class Solution27 {
    //Scaner for user input
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //prompt first name
        System.out.print("Enter the first name:");
        String firstName = sc.nextLine();
        //prompt last name
        System.out.print("Enter the last name:");
        String lastName = sc.nextLine();
        //prompt zip code
        System.out.print("Enter the ZIP code:");
        String zipCode = sc.nextLine();
        //prompt employee id
        System.out.print("Enter the employee ID:");
        String empID = sc.nextLine();

        /*Create a function for each validation rule. Then create a validateInput
        function that takes in all of the input data and invokes the specific
        validation functions.*/
        Solution27 s = new Solution27();
        s.validateInput(firstName,lastName,zipCode,empID);

    }

    private void validateInput(String firstName,String lastName, String zipCode,
                                     String empID) {
        //use string builder to build output string
        //call validation for rules
        StringBuilder outputString = new StringBuilder(validateFirstName(firstName));
        outputString = outputString.append(validateLastName(lastName));
        outputString = outputString.append(validateZipCode(zipCode));
        outputString = outputString.append(validateEmpID(empID));

        //use a single statement for outputs
        String singleString = (outputString.isEmpty() ? "No errors were found." : outputString.toString());
        //output();
        System.out.printf("%s",singleString);
    }

    public String validateEmpID(String empID) {
        String idError = "The employee ID must be in the format of AA-1234.\n";
        //is string null or wrong length
        if(empID.length() != 7) return idError;
        //check string format
        //string to char array
        char[] temp = empID.toCharArray();
        if(!Character.isLetter(temp[0])) return idError;
        if(!Character.isLetter(temp[1])) return idError;
        if(temp[2] != 45) return idError;
        for (int i = 3; i < 7; i++) {
            if (!Character.isDigit(temp[i])) return idError;
        }
        return "";
    }

    public String validateZipCode(String zipCode) {
        String zipError = "We only care about 'MERICA, so zipcode must be 5 digit number\n";
        //is string null or wrong length
        if(zipCode.length() != 5) return zipError;
        //is string all numbers
        try {
            Integer.parseInt(zipCode);
            return "";
        } catch(NumberFormatException e){
            return zipError;
        }

    }

    public String validateLastName(String lastName) {
        //is string null
        if(lastName == "") return "The last name must be filled in.\n";
        //does string have min 2 char
        if(lastName.length()<3) return "The last name must be at least 2 characters long.";

        return "";
    }

    public String validateFirstName(String firstName) {
        //is string null
        if(firstName == "") return "The first name must be filled in.\n";
        //does string have min 2 char
        if(firstName.length()<3) return "The first name must be at least 2 characters long.\n";

        return "";
    }
}
