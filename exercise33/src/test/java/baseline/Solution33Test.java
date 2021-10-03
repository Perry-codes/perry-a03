package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void responseOutput0() {
        //push int check string out
        Solution33 s = new Solution33();
        //{"Absolutely!","Fat Chance!","Eh, who knows?","Beep boop I AM ROBOT GROOT"};
         assertEquals("Absolutely!",s.responseOutput(0));
    }

    @Test
    void responseOutput2() {
        //push int check string out
        Solution33 s = new Solution33();
        //{"Absolutely!","Fat Chance!","Eh, who knows?","Beep boop I AM ROBOT GROOT"};
        assertEquals("Eh, who knows?",s.responseOutput(2));
    }
}