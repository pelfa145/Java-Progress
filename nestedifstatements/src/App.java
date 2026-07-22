
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int age;
        boolean isStudent = false;
        String isStudentans;
        boolean isSenior;
        double price = 9.99;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("Are you a student? Y/N: ");
        isStudentans = scanner.next();

        if (isStudentans.equals("Yes") || isStudentans.equals("yes") || isStudentans.equals("y") || isStudentans.equals("Y")) {
            isStudent = true;
            System.out.println("Moving to checkout..");
        }

        if (age > 30) {
            isSenior = true;
            if (isStudent && isSenior) {
                System.out.println("You get a student discount AND a senior discount");
                price = 5.99;
            }
        } else if (isStudent) {
            System.out.println("You qualify for a student discount with 10% off!");
            price = 8.99;
        } else {
            System.out.println("You dont qualify for any discounts proceed to checkout");
        }
        System.out.printf("You're total is: $%.2f!", price);
        scanner.close();

    }
}
