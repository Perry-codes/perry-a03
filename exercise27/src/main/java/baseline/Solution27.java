/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

public class Solution27 {
   /*
   Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is
valid according to these rules:
• The first name must be filled in.
• The last name must be filled in.
• The first and last names must be at least two characters long.
• An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
• The ZIP code must be a number.
Display appropriate error messages on incorrect data.

Constraints
• Create a function for each validation rule. Then create a validateInput function that takes in all of the input
data and invokes the specific validation functions.
• Use a single output statement to display the outputs.
    */

    public static void main(String[] args) {
        //prompt first name
        String firstName = nextLine;
        //prompt last name
        lastName = nextIn;
        //prompt zip code
        zipCode = nextIn;
        //prompt employee id
        empID = nextIn;

        /*Create a function for each validation rule. Then create a validateInput
        function that takes in all of the input data and invokes the specific
        validation functions.*/
        validateInput();

    }

    public static void validateInput(String firstName,String lastName, String zipCode,
                                     String empID) {
        //call validation for rules
        validateFirstName(firstName);
        validateLastName(lastName);
        validateZipCode(zipCode);
        validateEmpID(empID);

        //use a single statement for outputs
        output();
    }

    public static String validateEmpID(String empID) {
        //is string null
        //check string format
        return null;
    }

    public static String validateZipCode(String zipCode) {
        //is string null
        //is string al numbers
        return "return string";
    }

    public static String validateLastName(String lastName) {
        //is string null
        //does string have min 2 char
        return "return string";
    }

    public static String validateFirstName(String firstName) {
        //is string null
        //does string have min 2 char
        return "Return string";
    }
}
