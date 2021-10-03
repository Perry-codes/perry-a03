package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void karvonenHRTable() {
        //private output only method
    }

    @Test
    void karvonenHR1() {
        //push pulse age and intensity, check return
        //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        Solution31 s = new Solution31(80,51);
        int intensity55 = (int) (((220 - 51) - 80) * 55 / 100.0) + 80;
        assertEquals(String.format("%d bpm",intensity55),s.karvonenHR(55));
    }

    @Test
    void karvonenHR2() {
        //push pulse age and intensity, check return
        //TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
        Solution31 s = new Solution31(92,45);
        int intensity75 = (int) (((220 - 45) - 92) * 75 / 100.0) + 92;
        assertEquals(String.format("%d bpm",intensity75),s.karvonenHR(75));
    }
}