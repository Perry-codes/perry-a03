package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void passwordStrength() {
        //Pass int 0,1,4,5 return v. weak, weak, string, v strong, unknown
    }

    @Test
    void passwordValidator() {
        //Pass PW return integer - Dependent on sub functions
    }

    @Test
    void allNumbers() {
        //Pass all numbers return 0
        //Pass not all numbers return 1
    }

    @Test
    void underEightChar() {
        //pass string less than 8 char return 0
        //Pass string @ or + 8 char return 1
    }

    @Test
    void allLetters() {
        //Pass all letters return 1
        //Pass not all letters return 2
    }

    @Test
    void hasSpecialChar() {
        //Pass special char return 1
        //pass not special char return 0
    }
}