package com.example.roastapp;

public class UserAccount {

    private final String email;
    private final String password;

    public UserAccount(String email, String password){
        this.email = email;
        this.password = password;
    }

    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
}
