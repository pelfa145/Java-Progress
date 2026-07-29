package shopping_cart;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';

        System.out.print("What item would you like to buy?: ");
        
        item = scanner.nextLine();

        System.out.print("How much is your item?: ");

        price = scanner.nextDouble();

        System.out.print("How much "+item+" do you need?: ");

        quantity = scanner.nextInt();

        System.out.println("Shopping Cart: You have "+quantity+" "+item+"/s, your total is "+quantity*price+currency+" in your shopping cart right now");

        scanner.close();

    }

}
