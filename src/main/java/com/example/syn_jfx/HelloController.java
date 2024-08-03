package com.example.syn_jfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class HelloController {
    @FXML
    private Button ba;

    @FXML
    private Button bb;

    @FXML
    private Button bc;
    @FXML
    private AnchorPane sonPane;

    @FXML
    void firstFxml(MouseEvent event) {
        loadFxml(sonPane, getClass().getResource("first.fxml"));
    }

    @FXML
    void thirdFXml(MouseEvent event) {
        loadFxml(sonPane, getClass().getResource("two.fxml"));

    }

    @FXML
    void twoFxml(MouseEvent event) {
        loadFxml(sonPane, getClass().getResource("third.fxml"));

    }

    void loadFxml(AnchorPane father, URL fxml) {
        FXMLLoader fxmlLoader = new FXMLLoader(fxml);
        Parent root;
        try {
            root = fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        father.getChildren().setAll(root);
    }

    @FXML
    void initialize() {

    }
}