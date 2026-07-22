
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======WEIGHT CONVERTER======");

        double lbs;
        double kgs;
        int option;
        while (true) {

            System.out.println("1. Convert lbs to kgs\n2. Convert kgs to lbs\n3. Exit");

            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            if (option == 1) {
                System.out.print("Enter the weight in lbs: ");
                lbs = scanner.nextDouble();
                kgs = lbs / 2.205;
                System.out.printf("The new weight in kgs is: %.2f", kgs);

            } else if (option == 2) {
                System.out.print("Enter the weight in kgs: ");
                kgs = scanner.nextDouble();
                lbs = kgs * 2.205;
                System.out.printf("The new weight in lbs is: %.2f", lbs);

            } else if (option == 3) {
                System.out.println("See you again!");
                break;
            } else {
                System.out.println("Choose an option from 1-3");

            }
        }
        scanner.close();
    }
}
