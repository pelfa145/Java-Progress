public class Student {

    private String last;
    private String first;
    private int age;
    private String course;
    private int yearLevel;
    private final int studentID;

    public Student(String first, String last, int age, String course, int yearLevel, int studentID){

        this.first = first;
        this.last = last;
        this.age = age;
        this.course = course;
        this.yearLevel=yearLevel;
        this.studentID = studentID;

    }

    void printStudent(){
        System.out.println("Name: "+this.first+" "+this.last+"\n"+"Age: "+this.age+"\n"+"Course: "+this.course+"\n"+"Year: "+this.yearLevel);
    }
}
