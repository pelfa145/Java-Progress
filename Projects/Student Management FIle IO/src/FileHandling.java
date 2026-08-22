import com.sun.jdi.Field;

import java.io.*;
import java.util.NoSuchElementException;

public class FileHandling {


    static void loadFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\\|");
                Database.getStudents().add(new Student(
                        data[1],
                        data[2],
                        Integer.parseInt(data[3]),
                        data[4],
                        Integer.parseInt(data[0])
                ));
            }
            Database.printStudentInfo();
        } catch (IOException e) {
            try(FileWriter Create = new FileWriter("students.txt")){
                Create.write("Student Management\n");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    static void saveFile() {
        try (FileWriter writer = new FileWriter("students.txt")) {
            for (Student student : Database.getStudents()) {
                writer.write(student.getStudentID()+"|"+
                        student.getFirst()+"|"+
                        student.getLast()+"|"+
                        student.getAge()+"|"+
                        student.getCourse()+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static boolean ensureFileExists() {
        try {
            File file = new File("students.txt");
            if (file.exists()) {
                return true;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    static int generateID() {
        int last;
        try{last = Database.getStudents().getLast().getStudentID()+1;}
        catch (NoSuchElementException e){
            System.out.println("Not Found");
        return 2026000;
        }
        return last;
    }
}
