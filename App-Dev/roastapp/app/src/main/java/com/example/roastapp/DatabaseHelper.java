package com.example.roastapp;

import android.content.Context;
import android.database.sqlite.*;
public class DatabaseHelper extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "roast.db";
    private static final int DATABASE_VERSION = 1;
    private final static String table = "user_accounts";
    private final static String drop_table = "DROP TABLE IF EXISTS "+table;

    public DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE user_accounts (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "email TEXT NOT NULL UNIQUE," +
                "password TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(drop_table);
        onCreate(db);
    }
}
