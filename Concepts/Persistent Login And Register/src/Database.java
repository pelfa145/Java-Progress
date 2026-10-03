import java.util.ArrayList;
public class Database{

    private ArrayList<Account> accounts = new ArrayList<>();
    public ArrayList<Account> getAccounts = accounts;

    public void insertAccount(String email, String password){
        accounts.add(new Account(email, password));
    }
}