package com.example.roastapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class LoginPage extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText etEmail = findViewById(R.id.emailInputReg);
        EditText etPassword = findViewById(R.id.passwordInputReg);
        Button btnLogin = findViewById(R.id.btnLogin);

        AccountRepository repository = new AccountRepository(this);
        ArrayList<UserAccount> users = repository.returnAccounts();
        Intent intent = new Intent(this, MainActivityPage.class);

        btnLogin.setOnClickListener(v -> {
            String inputtedEmail = etEmail.getText().toString();
            String inputtedPassword = etPassword.getText().toString();
            if(isAnAccount(inputtedEmail, users)){
                login(inputtedEmail, inputtedPassword, users, intent);
                finish();
            }
            etEmail.setText("");
            etPassword.setText("");
            Toast.makeText(this, "No account with that email was found.", Toast.LENGTH_SHORT).show();
        });

    }

    boolean isAnAccount(String inputtedEmail, ArrayList<UserAccount> users) {
        for (UserAccount i : users) {
            String iEmail = i.getEmail();
            if(iEmail.equals(inputtedEmail)){
                return true;
            }
        }
        return false;
    }

    void login(String iEmail, String iPassword, ArrayList<UserAccount> users, Intent intent){
        for(var i : users){
            if(iEmail.equals(i.getEmail()) && iPassword.equals(i.getPassword())){
                startActivity(intent);
                Toast.makeText(this, "Successfully logged in!", Toast.LENGTH_SHORT).show();
                finish();
            }
        }
    }
}
