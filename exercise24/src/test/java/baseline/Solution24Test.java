package baseline;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void testIsAnagram() {
        Solution24 s1 = new Solution24("Test");
        Solution24 s2 = new Solution24("TTeS");

        assertTrue(s1.isAnagram(s1.toString(),s2.toString()));
    }

    @Test
    void testSortString() {
        Solution24 s = new Solution24("Test");
        String test = s.sortString(s.toString());
        assertEquals("estt", test);
    }

    @Test
    void testSortStringWithSpaces() {
        Solution24 s = new Solution24("Test One Two");
        String test = s.sortString(s.toString());
        assertEquals("eenoostttw", test);
    }

    @Test
    void testIsAnagramWitSpaces() {
        Solution24 s1 = new Solution24("The Morse Code");
        Solution24 s2 = new Solution24("Here come dots");

        assertTrue(s1.isAnagram(s1.toString(),s2.toString()));
    }
}