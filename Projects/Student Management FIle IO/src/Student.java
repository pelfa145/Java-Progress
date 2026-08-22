public class Student {

    private String first;
    private String last;
    private int age;
    private String course;
    private final int studentID;
    static FileHandling files = new FileHandling();

    public Student(String first, String last, int age, String course, int studentID) {
        this.first = first;
        this.last = last;
        this.age = age;
        this.course = course;
        this.studentID = studentID;
    }


    //getters
    String getFirst() {
        return this.first;
    }

    String getLast() {
        return this.last;
    }

    String getCourse() {
        return this.course;
    }

    String getName(){return this.first + " " + this.last;}

    int getAge() {
        return this.age;
    }

    int getStudentID(){return this.studentID;}

    //setters
    void setName(String[] newNames){
        String first;
        String last;
        if((newNames.length)>2){
            first = newNames[0] +" "+newNames[1];
            last = newNames[2];
        }
        else if((newNames.length)>0){
            first = newNames[0];
            last = newNames[1];
        }
        else{
            System.out.println("No new name found.");
        }
    }
    void setCourse(String newCourse){this.course = newCourse;}
    void setAge(int newAge){this.age = newAge;}

}
