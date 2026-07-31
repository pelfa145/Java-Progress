import java.util.Scanner;
public class countdown{
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        int start = 10;

        for (int i = start;i > 0;i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Happy Birday");



        
        input.close();
    }
}
