import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AccountManger {
    private static AccountManger instance; 

    Map<String, String> accountsMap = new HashMap<String, String>();
    
    private AccountManger() {

    }
    
    public void open(String acctNum, String name, AccountType type) {
        Account newAccount;
        switch(type){
            case BANK:
                newAccount = new BankAccount();
            break;
            case CREDIT:
                newAccount = new 
            break;
            case LOAN;

            break;
        }
    }

    public static AccountManger getInstance() {
        if(instance == null) {
            instance = new AccountManger();
        }
        return instance;   
    }

    public void openAccount(String accountNum, String name) {
        accountsMap.put(accountNum, name);
    }

    public String getAccount(String acctNum) {
        return accountsMap.get(acctNum);
    }

    public Collection<String> listAccountsMap() {
        return accountsMap.values();
    }

    public void closeAccount(String acctNum) {
        accountsMap.remove(acctNum);
    }
}