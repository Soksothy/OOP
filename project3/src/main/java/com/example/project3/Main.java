package com.example.project3;

public class Main {
    public static void main(String[] args){
        Username_Password usernamePassword = new Username_Password();

        Login loginPage = new Login(usernamePassword.getLoginInfo());
    }
}
