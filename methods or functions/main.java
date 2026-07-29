import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        happyBirthday(3);
        
        String yofull = getFullName();

        System.out.println(yofull);

        scanner.close();

    }
    static void happyBirthday(int waw){
        System.out.println("Hello, World! 1");
        System.out.printf("Hello, World! %d\n", waw);
        System.out.println("Hello, World! 3");
    }
    static String getFullName(){
        try{Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        return fullName;}
        finally{
            
        }
    }
}
