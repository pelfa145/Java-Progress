
import java.util.ArrayList;

public class Database {

    private ArrayList<Account> accounts = new ArrayList<>();
    public ArrayList<Account> getAccounts = accounts;

    public void insertAccount(String email, String password) {
        accounts.add(new Account(email, password));
    }

    public void insertAccount(String email, String password, String fullName) {
        accounts.add(new Account(email, password));
    }

    public boolean isAnAccount(String userInput) {
        for (var i : accounts) {
            if (i.getEmail().equals(userInput)) {
                return true;
            }
        }
        return false;
    }

    public boolean login(String userInput, String inputPassword) {
        for (var i : accounts) {
            if ((i.getEmail().equals(userInput) || i.getUsername().equals(userInput)) && i.getPassword().equals(inputPassword)) {
                return true;
            }
        }
        return false;
    }

    public Account getAccount(String userInput) {
        for (var i : accounts) {
            if (i.getEmail().equals(userInput)) {
                
                return i;
            }
        }
        return null;
 
   }
}