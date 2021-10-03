package baseline;

public class EmployeeList {

    //employee list with hard coded starting list
    private String[] currentList;

    public EmployeeList(String[] employeeList){
        //initialize class instance with array of names
        this.currentList = employeeList;
    }

    public String toString() {
        StringBuilder outputList = new StringBuilder(String.format("There are %d employees:%n", currentList.length));
        for (String s : currentList) {
            outputList.append(String.format("%s%n", s));
        }
        return outputList.toString();
    }

    public int findRemoveIndex(String removePerson) {
        //if person to remove matches one on list, return index for that person
        for(int i = 0; i< currentList.length; i++){
            if(removePerson.equals(currentList[i])) return i;
        }//if no matches return -1, will be used at a match check in the remove method
        return -1;
    }

    public void removeEmployee(int index){
        //if remove request doesnt match an array entry, do nothing
        if(index == -1) {
            System.out.println("No name match.");
        } else {
            //make new array 1 smaller than existing
            String[] tempArray = new String[currentList.length-1];
            //loop write new entries starting with the replacement index
            if (index >= 0) System.arraycopy(currentList, 0, tempArray, 0, index);
            if (tempArray.length - index >= 0)
                System.arraycopy(currentList, index + 1, tempArray, index, tempArray.length - index);
            //set new array to object array
            currentList = tempArray;
        }

    }
}
