import java.util.Scanner;
public class overloadedmethods{
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
        while(true){
            System.out.println("****************\nBanking Program\n****************\n1. Show Balance\n2. Deposit\n3. Withdraw\n4. Exit\n****************");      
            System.out.print("Enter your choice(1-4)");
            int choice;
            choice = input.nextInt();

            if (choice == 1){
                balance();
                System.out.println("Press enter to continue..");
                input.nextLine();
            }
        }
    }
        
    }
    public static void balance(){
        double balance = 0.00;
        System.out.printf("****************\n$%.2f\n****************", balance);
    }
} 