import java.util.Scanner;
public class InputHandler {
    static Scanner input = new Scanner(System.in);
    static FileHandler files = new FileHandler();
    int returnInt(){
        int integer = input.nextInt();
        input.nextLine();
        return integer;
    }

    void addTask(){
        System.out.print("Add a task -> ");
        String task = input.nextLine();
        files.addTask(task);
    }
    void closeFiles(){
        files.close();
    }
    void print(){
        files.printTasks();
    }
    void deleteTask(){
        System.out.print("Enter task to delete: ");
        String task = input.nextLine();
        files.deleteTask(task);
    }
}
