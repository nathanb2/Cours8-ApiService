package com.example.cours8_apiservice.api_service;

import com.example.cours8_apiservice.model.User;

import java.util.ArrayList;

/**
 * Class qui contient nos donnees (users) et les manipule
 * selon les actions possibles et declarees dans UserAPiService qui est ici implement
 */
public class FakeUserApiService implements UserApiService {

    ArrayList<User> users = new ArrayList<>();

    @Override
    public User getUser(long id) {
        for (User user: users){
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }

    @Override
    public User createUser(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User updateUser(User user) {
        User originUser = getUser(user.getId());
        if (originUser != null){
            originUser = user;
        }
        return originUser;
    }

    @Override
    public boolean removeUser(long id) {
        User originUser = getUser(id);
        if (originUser != null){
            users.remove(originUser);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<User> getAllUsers() {
        return users;
    }

    @Override
    public ArrayList<User> getMajorUsers() {
        ArrayList<User> majorUsers = new ArrayList<>();
        for (User user: users){
            if (user.getAge() >= 18){
                majorUsers.add(user);
            }
        }
        return majorUsers;
    }
}
