import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args) {
        try{
            FileWriter file = new FileWriter("test.txt");
            file.write("Hello This is my first File I/o Program.");

            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
