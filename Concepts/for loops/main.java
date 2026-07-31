import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int max;

        System.out.print("Enter max number: ");
        max = input.nextInt();

        
        for(int i = 1; i <= max; i++){
            System.out.println(i);
        }

        input.close();
    }
}