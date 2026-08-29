import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class FileHandling{
    static FileWriter write;


    static void loadFile(HashMap<Integer, Student> getStudents) throws IOException{
        try(BufferedReader reader = new BufferedReader(new FileReader("students.txt"))){
            String line;
            while((line = reader.readLine())!=null){
                String[] lf = line.split("\\|");
                String first = lf[0];
                String last = lf[1];
                int age = Integer.parseInt(lf[2]);
                String course = lf[3];
                int yearLvl = Integer.parseInt(lf[4]);
                int ID = Integer.parseInt(lf[5]);
                getStudents.put(ID, new Student(first, last, age, course, yearLvl, ID));
            }
        }catch (FileNotFoundException e){
            write = new FileWriter("students.txt");
            write.write("Initialized.");
            write.close();
        }

    }
}
