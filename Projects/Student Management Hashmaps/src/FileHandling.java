import java.io.*;
import java.util.HashMap;

public class FileHandling {
    static FileWriter writer;

    static void loadFile(HashMap<Integer, Student> getStudents) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lf = line.split("\\|");
                String first = lf[0];
                String last = lf[1];
                int age = Integer.parseInt(lf[2]);
                String course = lf[3];
                int yearLvl = Integer.parseInt(lf[4]);
                int ID = Integer.parseInt(lf[5]);
                System.out.println(first + " " + last + age + course + yearLvl + ID);
                Main.db.addStudents(first, last, age, course, yearLvl, ID);
            }
        } catch (FileNotFoundException e) {
            writer = new FileWriter("students.txt");
            writer.write("Initialized.");
            writer.close();
        }
    }

    static void saveFile(HashMap<Integer, Student> getStudents) throws IOException {
        writer = new FileWriter("students.txt");
        for (Student student : getStudents.values()) {
            writer.write(student.saveStudent());
        }
        writer.flush();
        writer.close();
    }
}
