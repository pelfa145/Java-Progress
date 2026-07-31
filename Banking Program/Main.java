import java.util.Scanner;

public class Main {
    static double balance = 0.00;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        print("Hello, World");

        showMenu();

    }

    static void print(String string) {
        System.out.println(string);
    }

    static void showMenu() {

        int choice = 0;
        print("Hello bruh");
        while (choice != 4) {
            print("Banking Program\n\n1. Show Balance\n2. Deposit Money\n3. Withdraw Money\n4. Quit\n");
            System.out.print("Choose an option 1-4: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 ->
                    showBalance();
                case 2 ->
                    depositMoney();
                case 3 ->
                    withdrawMoney();
                case 4 ->
                    print("Bye");
                default ->
                    print("Pick between 1-4.");
            }
        }
    }

    static void showBalance() {
        System.out.printf("Your balance is currently: %.2f$\n", balance);
    }

    static void depositMoney() {

        System.out.print("How much money do you want to deposit? in $: ");
        double input = scanner.nextDouble();
        balance = balance + input;

    }

    static void withdrawMoney() {
        System.out.print("How much money do you want to withdraw?: ");
        double input = scanner.nextDouble();
        balance = balance - input;
    }
}
