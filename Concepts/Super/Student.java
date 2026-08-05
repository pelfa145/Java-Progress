public class Student extends Person {
    boolean isEnrolled = true;
    int studentID;
    double GPA;
    Student(String firstName,String lastName, int age, double gpa, int studentID){
        super(firstName,lastName, age);
        this.studentID = studentID;
        this.GPA = gpa;
    }
    void printStudent(){
        System.out.println("This students name is "+this.firstName+" "+this.lastName+", he has a GPA of "+this.GPA+", and his student ID is "+studentID+".");
    }
    void displayGPA(){
        System.out.println(this.firstName+"'s GPA is "+this.GPA);
    }
}
