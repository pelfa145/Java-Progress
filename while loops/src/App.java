
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String name = "";

            while(name.isEmpty()) {
                System.out.print("Enter your name: ");
                name = input.nextLine();
                if (!name.isEmpty()){
                    break;
                }
            }

        System.out.println("Hello "+name);

    }
}
