package baseline;

public class EmployeeList {

    //employee list with hard coded starting list
    private String[] employeeList;

    public EmployeeList(String[] employeeList){
        this.employeeList = employeeList;
    }

    public String toString() {
        StringBuilder outputList = new StringBuilder(String.format("There are %d employees:%n", employeeList.length));
        for (String s : employeeList) {
            outputList.append(String.format("%s%n", s));
        }
        return outputList.toString();
    }

    public int findRemoveIndex(String removePerson) {
        return 0;
    }

    private void removeEmployee(int index){
        //make new array 1 smaller than exisiting
        //loop write new entries starting with the replacement index
        //set new array to object array
    }
}
