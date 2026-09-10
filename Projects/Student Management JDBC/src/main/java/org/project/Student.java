package org.project;

import lombok.Setter;

public class Student {
    //setters
    @Setter
    private String first;
    @Setter
    private String last;
    @Setter
    private int age;
    @Setter
    private String course;
    @Setter
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

}
