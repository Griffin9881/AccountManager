public class AccountManger {

    private static AccountManger INSTANCE = null; 
    public static void main(String[] args) {
        if(INSTANCE == null) {
            INSTANCE = new AccountManger();
        }
    }
     
}