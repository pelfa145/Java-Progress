package if_statements;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;

        System.out.print("How old are u?: ");
        
        age = scanner.nextInt();

        if(age >= 25){
            System.out.println("Damn u old asf");
        }
        else if (age >= 18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("Bitch ass nigga");
        }
        scanner.close();
    }
}
