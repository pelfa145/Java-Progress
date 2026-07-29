
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        double temp;
        double newTemp;
        String choice;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the temperature: ");
            temp = scanner.nextDouble();
            System.out.print("Convert to Celcius or Fahrenheit? (C or F) or exit to leave: ");
            choice = scanner.next();
        }
        newTemp = (choice.equals("C")) ? (temp - 32)* 5/9 : (temp * 5/9)+32;
        System.out.printf("%.1f°%s", newTemp, choice);
    }
}
