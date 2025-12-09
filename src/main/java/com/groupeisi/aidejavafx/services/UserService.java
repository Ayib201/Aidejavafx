package com.groupeisi.aidejavafx.services;

import com.groupeisi.aidejavafx.config.BaseService;
import com.groupeisi.aidejavafx.entities.User;
import com.groupeisi.aidejavafx.interfaces.IUser;

public class UserService extends BaseService implements IUser {
    public UserService() {
        super();
    }

    public void addUser(User user) {
        try{
            em.persist(user);
            em.flush();
            et.commit();
        }catch(Exception e){
            et.rollback();
        }
    }


    @Override
    public void removeuser() {

    }

    @Override
    public void updateuser() {

    }
}
