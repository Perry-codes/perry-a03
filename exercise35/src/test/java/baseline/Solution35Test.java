package baseline;

import org.junit.jupiter.api.Test;

//import java.util.ArrayList; for self testing

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {

    @Test
    void testOutput3() {
        //fix this to initialize array with hard coded names
        Solution35 s = new Solution35();
        s.contestants.add("Maggie");
        s.contestants.add("Max");
        s.contestants.add("Fred");
        s.contestants.add("Sam");
        //push known winner index, check winner
        assertEquals("The winner is..... Sam!",s.output(3));
    }

    @Test
    void testOutput0() {
        //fix this to initialize array with hard coded names
        Solution35 s = new Solution35();
        s.contestants.add("Maggie");
        s.contestants.add("Max");
        s.contestants.add("Fred");
        s.contestants.add("Sam");
        //push known winner index, check winner
        assertEquals("The winner is..... Maggie!",s.output(0));
    }

   /* @Test
    void listArrayAutoTrim(){
        //personal test to see if trimToSize method removes the blank string
        ArrayList<String> str = new ArrayList<>();
        str.add("Name1");
        str.add("Name2");
        str.add("");
        str.trimToSize();
        assertEquals(2,str.size());
        //failed to must check that "" is not added to the array list
    }*/

     /*@Test
    void listArrayAutoTrim(){
        //personal test to see if trimToSize method removes the blank string
        ArrayList<String> str = new ArrayList<>();
        str.add("Name1");
        str.add("Name2");
        str.add("");
        //check x-tra line to manually remove blank entry
        str.remove("");
        str.trimToSize();
        assertEquals(2,str.size());
        //passed
    }*/
}