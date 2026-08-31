package org.project;

public class Student {
    private String first;
    private String last;
    private int age;
    private String course;
    private int yearLevel;
    private final int studentID;

    public Student(int studentID, String first, String last, int age, String course, int yearLevel) {
        this.studentID = studentID;
        this.first = first;
        this.last = last;
        this.age = age;
        this.course = course;
        this.yearLevel = yearLevel;
    }
    //getters
    public int getStudentID(){return this.studentID;}
    public String getFirst(){return this.first;}
    public String getLast(){return this.last;}
    public String getCourse(){return this.course;}
    public int getAge(){return this.age;}
    public int getYearLevel(){return this.yearLevel;}
    //setters
    public void setFirst(String newFirst){this.first = newFirst;}
    public void setLast(String newLast){this.last = newLast;}
    public void setAge(int newAge){this.age = newAge;}
    public void setCourse(String newCourse){this.course = newCourse;}
    public void setYearLevel(int newYearLevel){this.yearLevel = newYearLevel;}
}
