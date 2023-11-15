package com.example.project3;

import javax.swing.*;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Login implements ActionListener{
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JLabel userIDLable = new JLabel("username");
    JLabel userPasswordLable = new JLabel("password");
    JLabel messageLable = new JLabel();
    HashMap<String,String> logininfo = new HashMap<String,String>();
    Login(HashMap<String,String> loginInfoOriginal){
        logininfo = loginInfoOriginal;
        frame.add(userIDLable);
        frame.add(userPasswordLable);
        userIDLable.setBounds(50,100,75,25);
        userPasswordLable.setBounds(50,100,75,25);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
