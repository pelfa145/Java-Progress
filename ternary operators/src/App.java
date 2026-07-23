
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        int hours;
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.printf("Input time of day in hours: ");
                hours = scanner.nextInt();
            }
        String timeOfDay = (hours >= 12) ? hours+":00 PM" : hours+"AM";
        System.out.println(timeOfDay);
    }
}

