import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        showMenu();


        scanner.close();
    }
    static void showMenu(){
        int choice = -1;
        while(choice!=3){
            System.out.println("----Student Management w/ Java----\n\n1.Add a student\n2.View students\n3.Quit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1 -> Students.addStudent();
                case 2 -> {}
                case 3 -> System.out.println("Bye");
            }
        }
    }
}
