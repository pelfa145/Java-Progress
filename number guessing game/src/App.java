
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int attempts = 0;
        int guess = 0;
        int randomnum = random.nextInt(100) + 1;

        System.out.println("Number Guessing Game\nGuess a number between 1-100");
        while (guess != randomnum){
            attempts += 1;
            System.out.print("Enter a guess: ");
            guess = input.nextInt();
            if(guess < randomnum){
                System.out.println("HIGHER!");
            } else if(guess > randomnum){
                System.out.println("LOWER!");
            }
        }
        System.out.println("In "+attempts+" attempts, you got "+guess+" which is the correct number!");
        input.close();
    }
}
