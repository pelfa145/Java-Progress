
public class Main {

    public static void main(String[] args) {

        landingPage();
        

    }

    static InputHandler input = new InputHandler();
    static Database db = new Database();

    static void landingPage() {
        boolean quit = false;
        while (!quit) {
            System.out.println("======Landing Page======\n1. Make an account\n2. Login\n3. Exit");
            System.out.print("Enter a choice: ");
            int choice = input.returnInteger();
            switch (choice) {
                case 1 ->
                    registerPage();
                case 2 ->
                    loginPage();
                case 3 ->
                    quit = true;
                default -> {
                    System.out.println("Invalid input");
                    return;
                }
            }
        }
    }

    static void registerPage() {
        boolean quit = false;

        while (!quit) {
            System.out.println("Register");
            System.out.print("Enter your email: ");
            String email = input.returnString();
            System.out.print("Enter your password: ");
            String password = input.returnString();
            System.out.print("Confirm your password: ");
            String confPassword = input.returnString();
            if (password.equals(confPassword)) {
                db.insertAccount(email, password);
            }
        }
    }

    static void loginPage() {
        boolean quit = false;

        while (!quit) {
            System.out.println("Login");
            System.out.print("Enter email/username: ");
            String userInput = input.returnString();
            System.out.print("Enter password: ");
            String password = input.returnString();
            if (!db.isAnAccount(userInput)) {
                continue;
            }
            Account account;
            if (db.login(userInput, password)) {
                account = db.getAccount(userInput);
                mainMenu(account);
            }
        }
    }

    static void mainMenu(Account account) {
        boolean quit = false;

        while (!quit) {
            System.out.println("Welcome\n1. Show Profile\n2. Change Password\n3. Logout\n4. Exit");
            System.out.print("Enter a choice: ");
            int choice = input.returnInteger();
            switch (choice) {
                case 1 ->
                    account.showProfile();
                case 2 -> {
                }
                case 3 -> {
                }
            }
        }
    }
}
