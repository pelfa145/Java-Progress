import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        try(FileWriter write = new FileWriter("text.txt",true);){
            write.write("Huwaw \n");
            for (int i = 0; i < 5; i++) {
                addThings(write);
            }
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Written.");
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("text.txt"))){
            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    static void addThings(FileWriter write) throws IOException {
        System.out.print("-> ");
        write.write(input.nextLine() + "\n");
    }
}
