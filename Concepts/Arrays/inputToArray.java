import java.util.Scanner;
import java.util.ArrayList;

public class inputToArray {
    public static void main(String[] args) {
        int size = 0;
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the quantity of food you'll order: ");
            size = scanner.nextInt();
            scanner.nextLine();

            
            ArrayList<String> food = new ArrayList<>();
            String addFood;

            for(int i = 0;i < size;i++){
                System.out.print("Enter a food: ");
                addFood = scanner.nextLine();
                food.add(addFood);
            }
            for(String i : food){

                System.out.println(i+".");

            }
            
        }

    }
}