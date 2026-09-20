package com.example.roastapp;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class AccountRepository {

    private final DatabaseHelper dbHelper;
    public AccountRepository(Context context){
        this.dbHelper = new DatabaseHelper(context.getApplicationContext());
    }

    public ArrayList<UserAccount> returnAccounts(){
        ArrayList<UserAccount> accounts = null;

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

}
