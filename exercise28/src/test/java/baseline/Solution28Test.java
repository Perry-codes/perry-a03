package baseline;

import org.junit.jupiter.api.Test;

import javax.management.ConstructorParameters;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {



    @Test
    void addNumbers() {
        //push 5 numbers to addNumbers function return sum
        Solution28 s = new Solution28();
        double[] testArray = {1, 2, 3, 4, 5};
        assertEquals(15, s.addNumbers(testArray) );
    }
}
