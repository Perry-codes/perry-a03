package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {


    @Test
    void validateEmpID() {
        //input emp ID return string
        Solution27 s = new Solution27();

        assertEquals("",s.validateEmpID("AA-1234"));
    }

    @Test
    void validateZipCode() {
        //input zip code return string
        Solution27 s = new Solution27();
        String zipError = "We only care about 'MERICA, so zipcode must be 5 digit number\n";
        assertEquals(zipError,s.validateZipCode("L56 5Q4"));
    }

    @Test
    void validateLastName() {
        //input string return string
        Solution27 s = new Solution27();
        String lNameNullError = "The last name must be filled in.\n";
        assertEquals(lNameNullError,s.validateLastName(""));
    }

    @Test
    void validateFirstName() {
        //input string return string
        Solution27 s = new Solution27();
        String fNameNullError = "The first name must be at least 2 characters long.\n";
        assertEquals(fNameNullError,s.validateFirstName("M"));
    }
}