public class AccountManger {

    private static AccountManger instance; 
    public static void main(String[] args) {
        if(instance == null) {
            instance = new AccountManger();
        }
    }
     
}