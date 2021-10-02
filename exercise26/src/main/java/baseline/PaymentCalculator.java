package baseline;

//Use a class called PaymentCalculator with a public method called
// calculateMonthsUntilPaidOff , which takes no
//parameters and returns the number of months.
public class PaymentCalculator {
    //initialize Payment Calc class with daily rate, balance, monthly payment
    private double dailyRate;
    private double balance;
    private double monthlyPayment;

    //class constructor
    public PaymentCalculator(double apr, double balance, double monthlyPayment){
        //set apr to daily rate
        this.dailyRate = apr/100/365;
        //set balance
        this.balance = balance;
        //set monthly payment
        this.monthlyPayment = monthlyPayment;
    }

    public int calculateMonthsUntilPaidOff() {
       //use equation n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        double constant = -(1.0 / 30.0);
        double numMonths = constant * Math.log(1 + (balance/monthlyPayment)*(1 - Math.pow(1 + dailyRate,30))) / Math.log(1 + dailyRate);
        //Round fractions of a cent up to the next cent when displaying information to the user
        return (int) Math.ceil(numMonths);

    }
}


