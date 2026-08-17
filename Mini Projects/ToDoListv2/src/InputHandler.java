import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;
public class InputHandler {
    static Scanner input = new Scanner(System.in);
    static FileHandler files = new FileHandler();
    void deleteTask(){

        System.out.print("Delete task -> ");
        String task = input.nextLine();
        files.deleteTask(task);
    }

    void viewTask(){
        files.viewTasks();
    }

    void addTask(){
        System.out.print("Task -> ");
        String task = input.nextLine();
        files.addTask(task);
    }

    int returnInt(){
        try {
            int Int = input.nextInt();
            input.nextLine();
            return Int;
        }
        catch (InputMismatchException e){
            return -1;
        }
    }

    void close(){
        input.close();
    }
}
