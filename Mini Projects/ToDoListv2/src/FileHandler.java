import java.io.*;
public class FileHandler {
    private static FileWriter notes;
    static{
        try{
           notes = new FileWriter("Todo.txt", true);
        }
        catch(IOException e){
            System.out.println("Something went wrong please try again.");
        }
    }

    private BufferedReader reader() throws IOException{
        return new BufferedReader(new FileReader("Todo.txt"));
    }

    void addTask(String task){
        try{
        notes.write(task+"\n");
        notes.flush();
        }
        catch (IOException e){
            System.out.println("Something went wrong.");
        }
    }

    void viewTasks(){
        try{
            BufferedReader filereader = reader();
            String line;
            while((line = filereader.readLine()) != null){
                System.out.println("★ "+line);
            }
            reader().close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    void deleteTask(String taskToDelete){
        try{
            FileWriter rewrite = new FileWriter("Todo.txt");
            BufferedReader filereader = reader();
            String line;
            boolean found = false;
            while((line= filereader.readLine())!=null){
                if(!line.equalsIgnoreCase(taskToDelete)){
                rewrite.write(line);
                found = true;
                }else{
                    continue;
                }
                reader().close();
            }
            if(!found){
                System.out.println("Task not found.");
            }
            rewrite.close();
        }
        catch (IOException e){
            System.out.println("Something went wrong.");
        }
    }


}
