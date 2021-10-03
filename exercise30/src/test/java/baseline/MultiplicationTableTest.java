package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableTest {

    @Test
    void formatBuffer2() {
        MultiplicationTable m = new MultiplicationTable(2);
        assertEquals(3,m.formatBuffer());
    }

    @Test
    void formatBuffer12() {
        MultiplicationTable m = new MultiplicationTable(12);
        assertEquals(5,m.formatBuffer());
    }
}