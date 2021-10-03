package baseline;

public class GuessingGame {

    private int difficulty;
    private int winningNumber;
    private int guessCount;

    //class constructor to launch class with difficulty set
    public GuessingGame(int difficulty){
        //set difficulty from input
        this.difficulty = difficulty;
        //start guess count at 0
        this.guessCount = 0;

        //set winning number
        setWinningNumber();
    }

    private void setWinningNumber() {
        int max;
        if(difficulty == 1) max = 10;
        else if(difficulty == 2) max = 100;
        else max = 1000;

        this.winningNumber = (int) Math.floor(Math.random()*(max+1));

    }

    private boolean guess(String guess) {
        //guess count +1

        //try to parse input string to int
        //if parse and matches winning num - output yay return true
        //if parse and no match output high or low and return false
        //catch format exception and return "bad input" and false
        return false;
    }

    public int getGuessCount(){
        return guessCount;
    }
}
