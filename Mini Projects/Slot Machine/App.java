
import java.util.Scanner;
import java.util.Random;


public class App {
    static int balance = 100;
    static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] slotMachineData = {
                {"🍒", "🍉", "🍋", "🔔", "⭐"},
                {"⭐", "🔔", "🍋", "🍉", "🍒"},
                {"🍉", "🍒", "⭐", "🍋", "🔔"}
        };

        while (true) {
            System.out.println("Welcome to Java Slots");
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: $");
            int bet = scanner.nextInt();
            if(bet > balance){
                System.out.println("Too big");
                continue;
            }
            balance -= bet;
            System.out.println("Spinning...");

            spin(slotMachineData, bet);
            System.out.print("Play again? y/n: ");
            String choice = scanner.next();
            choice = choice.toUpperCase();
            if (choice.equals("N")) {
                break;
            } else{
                System.out.println("Only Y or N");
            }

        }
    }

    static void spin(String[][] dataset, int bet) {
        String x = dataset[random.nextInt(0, 3)][random.nextInt(0, 5)];
        String y = dataset[random.nextInt(0, 3)][random.nextInt(0, 5)];
        String z = dataset[random.nextInt(0, 3)][random.nextInt(0, 5)];
        System.out.println(x + "|" + y + "|" + z);
        if (x.equals(y) | x.equals(z) | y.equals(z)) {
            System.out.println("You've won! +$50");
            balance += 50;
            balance += bet;
        } else {
            System.out.println("Oof!, You've lost -$"+bet);
        }
    }
}
