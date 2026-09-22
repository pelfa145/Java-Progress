package com.example.roastapp;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import java.util.ArrayList;

public class AccountRepository {

    private final DatabaseHelper dbHelper;
    public AccountRepository(Context context){
        this.dbHelper = new DatabaseHelper(context);
    }

    public ArrayList<UserAccount> returnAccounts(){
        ArrayList<UserAccount> accounts = new ArrayList<>();

        SQLiteDatabase db = dbHelper.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM user_accounts", null);

        if(cursor.moveToFirst()){
            do{
                String email = cursor.getString(cursor.getColumnIndexOrThrow("email"));
                String passwords = cursor.getString(cursor.getColumnIndexOrThrow("password"));
                accounts.add(new UserAccount(email, passwords));
            }while(cursor.moveToNext());
        }
        cursor.close();
        return accounts;
    }

    public long createAccount(String email, String password){
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("email", email);
        values.put("password", password);
        return db.insert("user_accounts", null, values);
    }
}
