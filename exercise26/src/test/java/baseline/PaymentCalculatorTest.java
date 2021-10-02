package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void paymentCalculator() {
        //push apr, balance, payment, return months
        PaymentCalculator p = new PaymentCalculator(12.0,5000.0,100);
        assertEquals(70,p.calculateMonthsUntilPaidOff());
    }
}