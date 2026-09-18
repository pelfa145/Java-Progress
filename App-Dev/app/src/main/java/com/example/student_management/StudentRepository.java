package com.example.student_management;

import java.util.ArrayList;

import android.content.ContentValues;
import android.database.sqlite.*;

public class StudentRepository{
    private static ArrayList<Student> students = new ArrayList<>();

    public static ArrayList<Student> getStudents(){return students;}
    SQLiteDatabase db;
    void addStudent(String first, String last, String course, int age, int yearLevel, boolean status, int studentID){
        ContentValues values = new ContentValues();


        int active;
        if(status){
            active = 1;
        }else{
            active = 0;
        }
        values.put("first_name", first);
        values.put("last_name", last);
        values.put("course", course);
        values.put("age", String.valueOf(age));
        values.put("year_level", yearLevel);
        values.put("student_id", studentID);
        values.put("year_level", first);
        values.put("status", active);

        long id = db.insert("students", null, values);

    }
}
