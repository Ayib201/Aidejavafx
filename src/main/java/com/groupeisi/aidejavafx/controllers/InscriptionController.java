package com.groupeisi.aidejavafx.controllers;

import com.groupeisi.aidejavafx.config.JpaUtils;
import com.groupeisi.aidejavafx.entities.User;
import com.groupeisi.aidejavafx.services.UserService;
import jakarta.persistence.EntityManager;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class InscriptionController {
    @FXML
    private TextField nom_tf;
    @FXML
    private TextField email_tf;
    @FXML
    private TextField tel_tf;
    @FXML
    private PasswordField password_tf;
    private JpaUtils jpaUtils;
    @FXML
    public void initialize() {}

    public void envoyer(MouseEvent mouseEvent) {
        User u = new User();
        u.setEmail(email_tf.getText());
        u.setName(nom_tf.getText());
        u.setPassword(password_tf.getText());
        u.setPhone(tel_tf.getText());
        UserService userService = new UserService();
        userService.addUser(u);
    }
}
