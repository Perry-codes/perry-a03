package baseline;

public class Password {
    //password var
    private String password;

    //class constructor
    public Password(String password){
        this.password = password;

        System.out.printf("The password '%s' is a %s",password,passwordStrength());
    }

    public int passwordValidator() {
        //add number values for each parameter
        //all numbers = 0 : 1
        //fewer than 8 char = 0 : 1
        //all letters = 1 : 2
        //special char = 1 : 0
        return 0;

    }

    public boolean allNumbers() {
        //check if all numbers
        return true;
    }

    public boolean underEightChar() {
        //check char count
        return true;
    }

    public boolean allLetters() {
        //chekc for all letters
        return true;
    }

    public boolean hasSpecialChar() {
        //search string for special character
        return true;
    }

    public String passwordStrength() {
        //convert numeric passValidator int to strength string
        //allNUm + fewEight = 0 - V. weak pw
        //allLet = fewEight = 1 - weak pw
        //notAllNum + notAllLet + eightPlus = 4 - strong pw
        //notAllNum + notAllLet + eightPlus + SpecChar = 5 - v strong pw
        //none of these = a pw of unknown strength
        return strengthString;
    }
}
