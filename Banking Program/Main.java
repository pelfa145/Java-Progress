import java.util.Scanner;

public class Main {
    static double balance = 0.00;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            print("Hello, World");

            showMenu(scanner);
        }
    }

    static void print(String string) {
        System.out.println(string);
    }

    static void showMenu(Scanner scanner) {

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
                    depositMoney(scanner);
                case 3 ->
                    withdrawMoney(scanner);
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

    static void depositMoney(Scanner scanner) {

        System.out.print("How much money do you want to deposit? in $: ");
        double input = scanner.nextDouble();
        balance = balance + input;

    }

    static void withdrawMoney(Scanner scanner) {
        System.out.print("How much money do you want to withdraw?: ");
        double input = scanner.nextDouble();
        balance = balance - input;
    }
}
