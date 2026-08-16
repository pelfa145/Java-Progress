import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class filereader {
    public static void main(String[] args) {
        try{
            FileReader file = new FileReader("test.txt");
            BufferedReader reader = new BufferedReader(file);

            String line;

            while((line = reader.readLine())!= null){
                System.out.println(line);
            }


            file.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
