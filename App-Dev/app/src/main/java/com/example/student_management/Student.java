package com.example.student_management;

public class Student {

    private String first;
    private String last;
    private String course;
    private int yearLevel;
    private int age;
    private int studentID;
    private boolean status;

    Student(String first, String last, String course, int age, int yearLevel, int studentID, boolean status){
        this.first = first;
        this.last = last;
        this.course = course;
        this.age = age;
        this.yearLevel = yearLevel;
        this.studentID = studentID;
        this.status = status;
    }

    int getStudentID(){
        return this.studentID;
    }
}
