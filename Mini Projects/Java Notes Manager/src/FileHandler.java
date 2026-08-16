import java.io.*;

public class FileHandler {
    private static FileWriter notes;
    static{try{notes = new FileWriter("notes.txt", true);} catch (IOException e) {
        throw new RuntimeException(e);
    }}

    public void closeNotes(){
        try{
            notes.close();
        }
        catch (IOException e){
            System.out.println("Something went wrong.");
        }
    }

    void writeToNotes(String contents){
        try{
            notes.write("\n"+contents);
            notes.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    void viewNotes(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("notes.txt"));
            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    void clearNotes(){
        try{
            FileWriter idk = new FileWriter("notes.txt", false);
            idk.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
