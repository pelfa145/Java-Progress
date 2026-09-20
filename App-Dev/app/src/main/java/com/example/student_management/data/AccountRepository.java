package com.example.student_management.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.student_management.model.Account;

import java.util.ArrayList;

public class AccountRepository {
    ArrayList<Account> accounts;

    private SQLiteDatabase db;
    private final DatabaseHelper dbHelper;
    public AccountRepository(Context context){dbHelper = new DatabaseHelper(context);}

}
