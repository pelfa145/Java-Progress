package random_numbers;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        System.out.println("Hello, World");
        Random random = new Random();
        int number;
        
        number = random.nextInt(1,6);

        System.out.println("Hello, new world");

        System.out.println(number);

        
    }
}
