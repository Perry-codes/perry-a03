package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void userRateofReturn() {
        //no test for user input verification
    }

    @Test
    void yearsToDouble() {
        //push rate, check return
        Solution29 s = new Solution29();
        assertEquals(18,s.yearsToDouble(4));
    }
}