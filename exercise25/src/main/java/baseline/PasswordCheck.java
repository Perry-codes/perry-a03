package baseline;

public class PasswordCheck {
    //password var
    private String password;
    private int numberCount;
    private int letterCount;
    private int specialCount;

    //class constructor
    public PasswordCheck(String password){
        //set password
        this.password = password;
        //send pw to count char types method to set char counts
        countCharTypes();
        int strength = passwordValidator();

        System.out.printf("The password '%s' is a %s",password,passwordStrength(strength));
    }

    public int passwordValidator() {
        int passwordStrength;
        //set strength based on implicit checks
        if(allNumbers() && underEightChar() ) passwordStrength = 0;
        else if(allLetters() && underEightChar()) passwordStrength = 1;
        else if(letterCount>0 && numberCount>0 && hasSpecialChar() && !underEightChar()) passwordStrength = 3;
        else if(letterCount>0 && numberCount > 0 && !underEightChar()) passwordStrength = 2;
        else passwordStrength = 4;
        return passwordStrength;

    }

    private void countCharTypes() {
        char[] temp = password.toCharArray();

        for (char c : temp) {
            if (Character.isDigit(c)) {
                numberCount++;
            } else if (Character.isLetter(c)) {
                letterCount++;
            } else specialCount++;
        }
    }

    public boolean allNumbers() {
         //check if all numbers
        //all numbers = 0 : 1
        return (password.length() == numberCount);
    }

    public boolean underEightChar() {
        //check char count
        //fewer than 8 char = 0 : 1
        return (password.length() < 8);
    }

    public boolean allLetters() {
        //check for all letters
        //all letters = 1 : 2
        return (password.length() == letterCount);
    }

    public boolean hasSpecialChar() {
        //search string for special character
        return (specialCount != 0);
    }

    public String passwordStrength(int strength) {
        //convert numeric passValidator int to strength string
        return switch (strength) {
            //allNUm + fewEight = 0 - V. weak pw
            case 0 -> "very weak password.";
            //allLet = fewEight = 1 - weak pw
            case 1 -> "weak password.";
            //notAllNum + notAllLet + eightPlus = 4 - strong pw
            case 2 -> "strong password.";
            //notAllNum + notAllLet + eightPlus + SpecChar = 5 - v strong pw
            case 3 -> "very strong password.";
            //none of these = a pw of unknown strength
            default -> "password of unknown strength.";
        };
    }
}
