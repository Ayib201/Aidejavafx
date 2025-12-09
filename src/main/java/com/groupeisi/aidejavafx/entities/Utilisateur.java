package com.groupeisi.aidejavafx.entities;

import lombok.Data;

@Data
public class Utilisateur extends User {
    private String password;
    private String login;
}
