public class CreditAccount extends Account {
    
    private static double creditLimit;
    private static double interestRate;
    private static int gracePeriod;
    private static int date;

    public CreditAccount(int acctNum, double creditLimit, double interestRate, int gracePeriod, double currentBalence) {
        super(acctNum, currentBalence);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
        this.gracePeriod = gracePeriod;
    }
    public static void increaseLimit(double increase) {
        creditLimit += increase;
    }
    
    public static double getCreditLimit(){ 
        return creditLimit - currentBalence;
    }

    public static void payCreditBalence(double money) {
        currentBalence -= money;
    }

    public static double checkGrace() {
        if 
    }
}
