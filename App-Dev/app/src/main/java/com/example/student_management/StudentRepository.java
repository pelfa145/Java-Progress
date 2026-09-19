package com.example.student_management;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.*;
import android.widget.TextView;
import android.widget.Toast;

public class StudentRepository {

    private SQLiteDatabase db;
    private final DatabaseHelper dbHelper;

    public StudentRepository(Context context) {
        dbHelper = new DatabaseHelper(context);
    }

    public long addStudent(String first, String last, String course, int age, int yearLevel, boolean status, int studentID) {
        ContentValues values = new ContentValues();

        db = dbHelper.getWritableDatabase();


        values.put("first_name", first);
        values.put("last_name", last);
        values.put("course", course);
        values.put("age", age);
        values.put("year_level", yearLevel);
        values.put("student_id", studentID);
        values.put("status", status ? 1 : 0);
        return db.insert("students", null, values);
    }

    public int scanID() {
        db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT MAX(student_id) FROM students",
                null);
        int maxId;
        if (cursor.moveToFirst()) {
            if (!cursor.isNull(0)) {
                maxId = cursor.getInt(0);
                return maxId;
            }
        }
        cursor.close();
        return -100;
    }

    public long studentDashboardUpdate(TextView tvTotalStudents,  TextView tvActiveStudents){
        db = dbHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT MAX(id) AS amount_of_students FROM students", null);
        if(cursor.moveToFirst()){
            int columnIndex = cursor.getColumnIndex("amount_of_students");
            int maxStudents = cursor.getInt(columnIndex);
            tvTotalStudents.setText(maxStudents);
        }
        Cursor cursor1 = db.rawQuery("SELECT COUNT(*) FROM students WHERE status = 1", null);
        if(cursor.moveToFirst()){
            int activeStudents = cursor1.getInt(0);
            tvActiveStudents.setText(activeStudents);
        }

        cursor.close();
        cursor1.close();
        return -100;
    }
}
