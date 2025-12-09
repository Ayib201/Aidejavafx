package com.groupeisi.aidejavafx.entities;

import lombok.Data;

@Data
public abstract class Personne {
    int id;
    String nom;
    String prenom;
    String email;
}

