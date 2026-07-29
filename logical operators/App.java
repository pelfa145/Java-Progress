
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //username must be between 4-12 characters
        //username must not contain spaces or underscores
        //username + " is valid!
        String username = "nothing";
        System.out.println(username.contains(" "));

        System.out.print("Enter your username: ");
        username = input.nextLine();

        if (username.length() > 12 || username.length() < 4) {
            System.out.println("username must be between 4-12 characters");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores");
        } else {
            System.out.println(username+" is a valid username!");
        }

        input.close();
    }
}
