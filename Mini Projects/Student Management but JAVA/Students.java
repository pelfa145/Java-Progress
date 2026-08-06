import java.util.ArrayList;

public class Students {

    static int studentID = 2026000;
    String first;
    String last;
    int age;
    String course;
    public static ArrayList<Students> studentList = new ArrayList<>();

    public Students(String first, String last, int age, String course) {
        this.first = first;
        this.last = last;
        this.age = age;
        this.course = course;

    }


    static void addStudent() {
        if (!studentList.isEmpty()) {
            studentID++;
        }
        System.out.print("Enter students name: ");
        String[] getName = Main.scanner.nextLine().split(" ");
        String firstN;
        String lastN;
        if (getName.length > 2) {
            firstN = getName[0] + " " + getName[1];
            lastN = getName[getName.length - 1];
        } else {
            firstN = getName[0];
            lastN = getName[getName.length - 1];
        }
        System.out.println(firstN + " " + lastN);
        System.out.print("Enter your age: ");
        int age = Main.scanner.nextInt();
        Main.scanner.nextLine();
        System.out.print("Enter your course: ");
        String course = Main.scanner.nextLine();
        studentList.add(new Students(firstN, lastN, age, course));
        System.out.println(studentList);

    }
    @Override
    public String toString() {
        return "Name: " + first + " " + last + " (Age: " + age + ", Course: " + course +", StudentID: "+studentID+ ")";
    }
}



