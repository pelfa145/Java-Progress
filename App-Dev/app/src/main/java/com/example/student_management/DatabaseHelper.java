package com.example.student_management;

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
                "status INTEGER NOT NULL DEFAULT 1 CHECK (is_active IN (0, 1))," +
                "age INTEGER);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void getWritableDatabase
}
