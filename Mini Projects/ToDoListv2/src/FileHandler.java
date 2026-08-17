import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    private static FileWriter list;
    static{
       try{
            list = new FileWriter("todolist.txt", true);
        }catch (IOException e){
            System.out.println("Something went wrong.");
        }
    }
    void addTask(String task){
        try{
            list.write(task+"\n");
            list.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    void close(){
        try{
            list.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    void printTasks(){
        try{

            BufferedReader reader = new BufferedReader(new FileReader("todolist.txt"));
            String task;
            while((task = reader.readLine())!= null){
                System.out.println("-"+task);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void deleteTask(String taskToDelete){
        try{
            ArrayList<String> lines = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader("todolist.txt"));
            String task;
            while((task = reader.readLine())!= null){
                if(!task.equalsIgnoreCase(taskToDelete)){
                    lines.add(task);
                }
            }
            reader.close();
            FileWriter writer = new FileWriter("todolist.txt");
            for (String tasks : lines){
                writer.write(tasks + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
