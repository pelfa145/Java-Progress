import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Enter a fruit to add(type 0 if done): ");
            String newFruit = input.nextLine();
            if(newFruit.equals("0")){
                break;
            }
            fruits.add(newFruit);
        }
        System.out.println("Your fruits: ");
        for (String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
