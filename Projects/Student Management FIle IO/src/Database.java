import java.util.ArrayList;

public class Database {
    private static final ArrayList<Student> students = new ArrayList<>();

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void printStudentInfo() {
        for (Student student : students) {
            System.out.println(student.getFirst() + " " + student.getLast() + "|" + student.getAge() + "|" + student.getCourse() + "|" + student.getStudentID());
        }
    }

    static void printSpecificStudentInfo() {
        Student currentStudent = null;
        int id = InputHandler.askForID();
        if (findStudent(id) != -1) {
            int index = findStudent(id);
            currentStudent = getStudents().get(index);
            System.out.println("\nName: " + currentStudent.getName() + "\nAge: " + currentStudent.getAge() + "\nCourse: " + currentStudent.getCourse() + "\nStudent ID: " + currentStudent.getStudentID());
            return;
        }
        System.out.println("No student with " + id + " was found.");
    }

    static void printSpecificStudentInfo(int id) {
        Student currentStudent = null;
        if (id != -1) {
            currentStudent = getStudents().get(id);
            System.out.println("\nName: " + currentStudent.getName() + "\nAge: " + currentStudent.getAge() + "\nCourse: " + currentStudent.getCourse() + "\nStudent ID: " + currentStudent.getStudentID());
            return;
        }
        System.out.println("No student with that ID was found.");
    }

    static void addStudent(String first, String last, int age, String course) {
        students.add(new Student(first, last, age, course, FileHandling.generateID()));
        FileHandling.saveFile();
        FileHandling.loadFile();
    }

    static void removeStudent() {
        int studentIDToLookFor = InputHandler.askForID();
        int index = findStudent(studentIDToLookFor);
        try {
            Student deletedStudent = getStudents().get(index);
            getStudents().remove(index);
            System.out.println("Removed Student: " + deletedStudent.getName());
        } catch (Exception e) {
            System.out.println("No student with " + studentIDToLookFor + " ID was find");
        }
    }

    static int findStudent(int student) {
        for (int i = 0; i < getStudents().size(); i++) {
            if (student == (getStudents().get(i).getStudentID())) {
                return i;
            }
        }
        return -1;
    }

    static void updateStudent() {
        int studentIDToLookFor = InputHandler.askForID();
        int index = findStudent(studentIDToLookFor);
        printSpecificStudentInfo(index);
        int choice = InputHandler.askForChoice();
        Student currStudent = getStudents().get(index);
        switch(choice){
            case 1 -> {InputHandler.changeName(currStudent);}
            case 2 -> {InputHandler.changeAge(currStudent);}
            case 3 -> {InputHandler.changeCourse(currStudent);}
            default -> System.out.println("Choose between 1-3.");
        }
        FileHandling.saveFile();
    }


}
