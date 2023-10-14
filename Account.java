public abstract class Account {

    public static int AcctNum;
    public static double currentBalence;

    public Account(int AcctNum, double currentBalence) {

    }

    public static int getAcctNum() {
        return AcctNum;
    }
    public static double getBalance() {
        return currentBalence;
    }

}
