package com.example.student_management;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.*;

public class StudentRepository {
    private static ArrayList<Student> students = new ArrayList<>();

    public static ArrayList<Student> getStudents() {
        return students;
    }

    private SQLiteDatabase db;
    private DatabaseHelper dbHelper;

    public StudentRepository(Context context) {
        dbHelper = new DatabaseHelper(context);
    }

    public void addStudent(String first, String last, String course, int age, int yearLevel, boolean status, int studentID) {
        ContentValues values = new ContentValues();

        db = dbHelper.getWritableDatabase();


        values.put("first_name", first);
        values.put("last_name", last);
        values.put("course", course);
        values.put("age", age);
        values.put("year_level", yearLevel);
        values.put("student_id", studentID);
        values.put("status", status ? 1 : 0);
        db.insert("students", null, values);

    }
}
