
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate in percentage: ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("How many years?: ");
        years = scanner.nextInt();

        amount = principal * Math.pow((1 + rate / timesCompounded), (timesCompounded * years));

        System.out.printf("The calculation comes to: %f", amount);

        scanner.close();
    }
}
