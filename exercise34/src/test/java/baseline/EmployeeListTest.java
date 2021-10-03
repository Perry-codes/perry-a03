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

    @Test
    void testfindRemoveIndex(){
        String[] testList = new String[]{"Maggie Perry","Dr. H"};
        EmployeeList e = new EmployeeList(testList);
        assertEquals(1,e.findRemoveIndex("Dr. H"));
    }

    @Test
    void testfindRemoveIndexNonMatch(){
        String[] testList = new String[]{"Maggie Perry","Dr. H"};
        EmployeeList e = new EmployeeList(testList);
        assertEquals(-1,e.findRemoveIndex("Dr. Q"));
    }

    @Test
    void testRemoveEmployee() {
        String[] testList = new String[]{"Maggie Perry","Dr. H"};
        EmployeeList e = new EmployeeList(testList);
        String testOutput = String.format("There are 1 employees:%nMaggie Perry%n") ;
        e.removeEmployee(1);
        assertEquals(testOutput,e.toString());
    }
}