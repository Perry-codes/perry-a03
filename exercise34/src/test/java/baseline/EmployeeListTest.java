package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {

    @Test
    void testToString() {
        String[] testList = new String[]{"Maggie Perry"};
        EmployeeList e = new EmployeeList(testList);
        String testOutput = String.format("There are 1 employees:%nMaggie Perry%n") ;
        assertEquals(testOutput,e.toString());
    }
}