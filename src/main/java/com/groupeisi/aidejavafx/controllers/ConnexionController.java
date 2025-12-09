package com.groupeisi.aidejavafx.controllers;

import com.groupeisi.aidejavafx.entities.Personne;
import com.groupeisi.aidejavafx.entities.Utilisateur;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ConnexionController {
    @FXML
    private TextField email_tf;
    @FXML
    private PasswordField password_tf;

    @FXML
    private Button connecter_btn;

    public void initialize() {
        Utilisateur utilisateur = new Utilisateur();
    }

    public void Envoyer(MouseEvent mouseEvent) {

        System.out.println("envoyer");
        System.out.println(email_tf.getText() + " " + password_tf.getText());
    }
}
