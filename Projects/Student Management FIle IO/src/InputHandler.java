import javax.xml.crypto.Data;
import java.util.Scanner;

public class InputHandler {
    static Scanner input = new Scanner(System.in);

    String returnString(){
        return input.nextLine();
    }

    public void showMenu(){
        boolean quit = false;
        while(!quit){
            System.out.println("\nStudent Management File I/O\n\n1.Add a student\n2.View students\n3.Print a students info\n4.Update student info\n5.Remove Student\n6.Exit");
            System.out.print("Enter your choice: ");
            int choice = returnInt();
            switch(choice){
                case 1 -> addStudent();
                case 2 -> Database.printStudentInfo();
                case 3 -> Database.printSpecificStudentInfo();
                case 4 -> Database.updateStudent();
                case 5 -> Database.removeStudent();
                case 6 -> quit = true;
            }
        }
    }

    static void addStudent(){
        String first;
        String last;
        int age;
        String course;

        System.out.print("Enter your name: ");
        String[] nameParts = input.nextLine().split("\\s+");
        if(nameParts.length>=3){
            first = nameParts[0] + " " + nameParts[1];
            int i = (nameParts.length) - 1;
            last = nameParts[i];
        }else{first = nameParts[0];last = nameParts[1];}
        System.out.print("Enter your age: ");
        age = returnInt();
        System.out.print("Enter your course: ");
        course = input.nextLine();
        Database.addStudent(first, last, age, course);
    }
    static int returnInt(){
        int Int = input.nextInt();
        input.nextLine();
        return Int;
    }
    static int askForID(){
        System.out.print("Enter student ID: ");
        return returnInt();
    }

    static int askForChoice(){
        System.out.println("Enter choice (1 → Name|2 → Age|3 → Course): ");
        return returnInt();
    }

    static void changeName(Student student){
        System.out.println("Enter new name: ");
        String[] newNames = input.nextLine().split("\\s+");
        student.setName(newNames);
    }
    static void changeAge(Student student){
        System.out.println("Enter new age: ");
        int newAge = returnInt();
        student.setAge(newAge);
    }
    static void changeCourse(Student student){
        System.out.println("Enter new course: ");
        String newCourse = input.nextLine();
        student.setCourse(newCourse);
    }

}
