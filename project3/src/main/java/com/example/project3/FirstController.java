package com.example.project3;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.ResourceBundle;

public class FirstController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    //===========================================================================================
                                //*****Button Controller*****
    public void switchToAdmin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Admin-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToRecieptionist(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Recieptionist-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchBackToStart(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Start-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //===========================================================================================
                                //*****Login Controller*****


    //===========================================================================================
                                //*****Create Account Controller*****


}