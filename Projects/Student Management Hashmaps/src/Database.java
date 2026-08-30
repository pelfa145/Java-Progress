import javax.imageio.metadata.IIOMetadataNode;
import java.util.*;
public class Database {
    private HashMap<Integer, Student> students = new HashMap<>();
    public HashMap<Integer, Student> getStudents() {
        return students;
    }

    public void addStudent(){
// the load file aint working properly, fix it.
        System.out.print("Enter student name(LastName, FirstName): ");

        String name = InputHandler.returnString();
        String[] nameParts = name.split(", ");

        String last = nameParts[0];
        String first = nameParts[1];

        System.out.print("Enter your age: ");
        int age = InputHandler.returnInt();

        System.out.print("Enter your course: ");
        String course = InputHandler.returnString();

        System.out.print("Enter your year level: ");
        int yearLvl = InputHandler.returnInt();

        int id = generateID();

        getStudents().put(id, new Student(first, last, age, course, yearLvl, id));

    }
    public void addStudents(String first, String last, int age, String course, int yearLvl, int id){
        getStudents().put(id, new Student(first, last, age, course, yearLvl, id));
    }

    int generateID(){
        if(!getStudents().isEmpty()){
            int amount = getStudents().size() + 2026000;
            return amount;
        }
        return 2026000;
    }
    public void printStudentInfo(){
        System.out.print("Enter Student ID: ");
        int id = InputHandler.returnInt();
        try{getStudents().get(id).printStudent();
        }
        catch (NullPointerException e){
            System.out.println("Student Not Found.");
        }
    }
}
