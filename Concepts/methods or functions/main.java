import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int age = 21;

        if (ageCheck(age)){
            System.out.println("You are over 18");
        } else{System.out.println("You are underage");}

        happyBirthday(3);
        scanner.close();
    }
    static void happyBirthday(int waw){
        System.out.println("Hello, World! 1");
        System.out.printf("Hello, World! %d\n", waw);
        System.out.println("Hello, World! 3");
    }
public static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }else{return false;}
    }
}