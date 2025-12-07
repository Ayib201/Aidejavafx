package com.groupeisi.aidejavafx.entities;

import lombok.Data;

@Data
public class User {
    int id;
    String name;
    String email;
    String phone;
    String password;
}
