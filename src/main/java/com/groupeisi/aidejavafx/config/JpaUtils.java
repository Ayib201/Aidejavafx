package com.groupeisi.aidejavafx.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtils {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("AideJavaPU");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public static void close() {
        emf.close();
    }

}
