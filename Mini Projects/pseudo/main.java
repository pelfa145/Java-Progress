import java.util.Scanner;
public class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Is the lamp plugged in? yes/no: ");
        String pluggedIn = input.nextLine();

        if(pluggedIn.equalsIgnoreCase("no")){
            System.out.println("Plug in the lamp");
        }else{
            System.out.println("Is the buld burned out? yes/no: ");
            String burnedOut = input.nextLine();
            if(burnedOut.equalsIgnoreCase("no")){
                System.out.println("Buy new lamp");
            }else{
                System.out.println("Replace Bulb");
            }
        }
        input.close();
    }
}