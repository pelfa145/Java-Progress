package com.example.student_management;

public class Student {

    String first;
    String last;
    String course;
    int yearLevel;
    int age;
    int studentID;

    Student(String first, String last, String course, int age, int yearLevel, int studentID){
        this.first = first;
        this.last = last;
        this.course = course;
        this.age = age;
        this.yearLevel = yearLevel;
        this.studentID = studentID;
    }
}
