package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {

    //new Solution36 object with hard coded array

    @Test
    void average() {
        //initialize a test object
        ArrayList<Integer> testArray = new ArrayList<>(Arrays.asList(10,12,22,34,21));
        Solution36 testObject = new Solution36(testArray);
        //check avg function
        assertEquals(19.8, testObject.average(testArray));
    }

    @Test
    void max() {
        //initialize a test object
        ArrayList<Integer> testArray = new ArrayList<>(Arrays.asList(10,12,22,34,21));
        Solution36 testObject = new Solution36(testArray);
        //check max function
        assertEquals(34, testObject.max(testArray));
    }

    @Test
    void min() {
        //initialize a test object
        ArrayList<Integer> testArray = new ArrayList<>(Arrays.asList(10,12,22,34,21));
        Solution36 testObject = new Solution36(testArray);
        //check min function
        assertEquals(10, testObject.min(testArray));
    }

    @Test
    void std() {
        //initialize a test object
        ArrayList<Integer> testArray = new ArrayList<>(Arrays.asList(10,12,22,34,21));
        Solution36 testObject = new Solution36(testArray);
        //check std deviation
        assertEquals(8.508, testObject.std(testArray),0.001);
    }

}