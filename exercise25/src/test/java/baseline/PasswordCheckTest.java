package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckTest {

    @Test
    void passwordStrengthWeak() {
        //Pass int 0,1,2,3 return v. weak, weak, string, v strong, unknown
        PasswordCheck p = new PasswordCheck("Pasword");
        int strength = 1;
        assertEquals("weak password.",p.passwordStrength(strength));
    }

    @Test
    void passwordStrengthVeryWeak() {
        //Pass int 0,1,2,3 return v. weak, weak, string, v strong, unknown
        PasswordCheck p = new PasswordCheck("Pasword");
        int strength = 0;
        assertEquals("very weak password.",p.passwordStrength(strength));
    }

    @Test
    void passwordStrengthStrong() {
        //Pass int 0,1,2,3 return v. weak, weak, string, v strong, unknown
        PasswordCheck p = new PasswordCheck("Pasword");
        int strength = 2;
        assertEquals("strong password.",p.passwordStrength(strength));
    }

    @Test
    void passwordStrengthVeryStrong() {
        //Pass int 0,1,2,3 return v. weak, weak, string, v strong, unknown
        PasswordCheck p = new PasswordCheck("Pasword");
        int strength = 3;
        assertEquals("very strong password.",p.passwordStrength(strength));
    }

    @Test
    void passwordStrengthUnknown() {
        //Pass int 0,1,2,3 return v. weak, weak, string, v strong, unknown
        PasswordCheck p = new PasswordCheck("Pasword");
        int strength = 4;
        assertEquals("password of unknown strength.",p.passwordStrength(strength));
    }

    @Test
    void passwordValidatorVeryWeak() {
        //Pass PW return integer - Dependent on sub functions
        PasswordCheck p = new PasswordCheck("1269");
        assertEquals(0,p.passwordValidator());
    }

    @Test
    void passwordValidatorWeak() {
        //Pass PW return integer - Dependent on sub functions
        PasswordCheck p = new PasswordCheck("pWord");
        assertEquals(1,p.passwordValidator());
    }

    @Test
    void passwordValidatorStrong() {
        //Pass PW return integer - Dependent on sub functions
        PasswordCheck p = new PasswordCheck("pa55word");
        assertEquals(2,p.passwordValidator());
    }

    @Test
    void passwordValidatorVeryStrong() {
        //Pass PW return integer - Dependent on sub functions
        PasswordCheck p = new PasswordCheck("P@s5word");
        assertEquals(3,p.passwordValidator());
    }

    @Test
    void passwordValidatorUnknown() {
        //Pass PW return integer - Dependent on sub functions
        PasswordCheck p = new PasswordCheck("P5ord");
        assertEquals(4,p.passwordValidator());
    }

    @Test
    void allNumbersFalse() {
        //Pass not all numbers return 1
        PasswordCheck p = new PasswordCheck("Pasword");

        assertFalse(p.allNumbers());
    }
    @Test
    void allNumbersTrue() {
        //Pass all numbers return 0
        PasswordCheck p = new PasswordCheck("15268954632514859");

        assertTrue(p.allNumbers());
    }

    @Test
    void underEightCharTrue() {
        //pass string less than 8 char return true
        PasswordCheck p = new PasswordCheck("Pasword");

        assertTrue(p.underEightChar());
    }

    @Test
    void underEightCharFalse() {
        //Pass string @ or + 8 char return false
        PasswordCheck p = new PasswordCheck("Password");

        assertFalse(p.underEightChar());
    }

    @Test
    void allLettersTrue() {
        //Pass all letters return 1
        PasswordCheck p = new PasswordCheck("Password");

        assertTrue(p.allLetters());
    }

    @Test
    void allLettersFalse() {
        //Pass not all letters return 2
        PasswordCheck p = new PasswordCheck("Pa55word");

        assertFalse(p.allLetters());
    }

    @Test
    void hasSpecialCharTrue() {
        //Pass special char return true
        PasswordCheck p = new PasswordCheck("Pa$$word");

        assertTrue(p.hasSpecialChar());
    }

    @Test
    void hasSpecialCharFalse() {
        //Pass no special char return false
        PasswordCheck p = new PasswordCheck("Pa2563ord");

        assertFalse(p.hasSpecialChar());
    }
}