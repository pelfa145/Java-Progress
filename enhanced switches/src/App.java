
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("======MENU======");
        System.out.println("1. Print Hello\n2. Print What\n3. Print Bro\n4. Print Animal\n5.Print Engk");
        System.out.print("Choose between 1-5: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1 ->
                System.out.println("Hello, World");

            case 2 ->
                System.out.println("What bro?");

            case 3 ->
                System.out.println("BROOO *skullemoji*");

            case 4 ->
                System.out.println("ANIMAL KA BA 😭");

            case 5 ->
                System.out.println("NGEKKKKK wrong ka boi");

            default ->
                System.out.println("Wa man tawon nay apil sa choices oi chupi ddto");

        }
        scanner.close();
    }
}
