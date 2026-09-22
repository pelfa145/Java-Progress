package com.example.student_management.data;

import android.content.Context;
import android.database.sqlite.*;
public class DatabaseHelper extends SQLiteOpenHelper{

    private static final String database_name = "student_hub.db";
    private static final int database_version = 1;

    public DatabaseHelper(Context context){
        super(context, database_name,null, database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE students (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "student_id INTEGER UNIQUE NOT NULL, " +
                "first_name TEXT," +
                "last_name TEXT," +
                "course TEXT," +
                "year_level INTEGER," +
                "status INTEGER NOT NULL DEFAULT 1 CHECK (status IN (0, 1))," +
                "age INTEGER);");

        db.execSQL("CREATE TABLE accounts (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "email TEXT UNIQUE NOT NULL," +
                "password TEXT UNIQUE NOT NULL);");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
