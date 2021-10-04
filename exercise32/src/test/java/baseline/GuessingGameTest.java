package baseline;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessingGameTest {

    @RepeatedTest(100)
    void setWinningNumber1() {
        //push difficulty, check that winning number is between 1 and max
        //check that maxGuess is 10 or 100 or 1000 accordingly
        GuessingGame g = new GuessingGame(1);
        assertTrue(g.winningNumber<11);
    }
    @RepeatedTest(1000)
    void setWinningNumber2() {
        //push difficulty, check that winning number is between 1 and max
        //check that maxGuess is 10 or 100 or 1000 accordingly
        GuessingGame g = new GuessingGame(2);
        assertTrue(g.winningNumber<101);
    }
    @RepeatedTest(1000)
    void setWinningNumber3() {
        //push difficulty, check that winning number is between 1 and max
        //check that maxGuess is 10 or 100 or 1000 accordingly
        GuessingGame g = new GuessingGame(1);
        assertTrue(g.winningNumber<1001);
    }
}