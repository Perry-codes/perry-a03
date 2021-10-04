package baseline;

public class MultiplicationTable {
    //variable to hold table size
    private int tableSize;

    public MultiplicationTable(int tableSize) {
        //table object is created with size declared
        this.tableSize = tableSize;

        printMultiplicationTable();
    }

    private void printMultiplicationTable() {
        //int to hold format buffer #
        int formatBuffer = formatBuffer();
        //nested for loops, outside I loop for rows
        for(int i = 1; i <= tableSize; i++){
            //inside j loops for columns
            for(int j = 1; j <= tableSize; j++){
                //sonarLint error ignored - I could not get format specifier to work with buffer variable for dynamic spacing
                System.out.printf("%"+formatBuffer+"d",i*j);
            }
            System.out.println("\n");
        }
    }

    public int formatBuffer() {
        //find the highest int value on table - tableSize^2
        String digitCount = Integer.toString(tableSize * tableSize);
        //add 2 for 2 char spacing on max digits
        return digitCount.length() + 2;
    }
}
