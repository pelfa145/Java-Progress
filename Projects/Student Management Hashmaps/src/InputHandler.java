import java.io.IOException;
import java.util.Scanner;
public class InputHandler {
    static Scanner input = new Scanner(System.in);
    static void showMenu(){
        boolean quit = false;
        while(!quit){
            System.out.println("Student Management\n1.Add a student\n2.View Student Info\n3.Print All Students\n4.Delete Student\n5.Update Student\n6.Quit\n");
            System.out.print("Enter your choice: ");
            int choice = returnInt();

            switch (choice){
                case 1 -> {
                    Main.db.addStudent();
                    try{FileHandling.saveFile(Main.db.getStudents());} catch (IOException e) {
                        System.out.println("Something went wrong.");
                    }
                }
                case 2 -> {
                    Main.db.printStudentInfo();
                    try{FileHandling.saveFile(Main.db.getStudents());} catch (IOException e) {
                        System.out.println("Something went wrong.");
                    }
                }
                case 3 -> {}
                case 4 -> {}
                case 5 -> {}
                case 6 -> quit = true;
            }

        }
    }

    static String returnString(){
        return input.nextLine();
    }

    static int returnInt(){
        int Int = input.nextInt();
        input.nextLine();
        return Int;
    }

    static void close(){
        input.close();
    }

}
