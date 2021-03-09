package com.example.cours8_apiservice.api_service;

import com.example.cours8_apiservice.model.User;

import java.util.ArrayList;

/**
 * Declare les differentes actions realisable sur les donnees
 * et sera implemente par la classe qui conserve les donnees et les manipules
 * Dans le projet FakeApiService mais cela pourait etre remplace par une auttre class comme une DataBase ou effectuer des request vers un server
 */
public interface UserApiService {

    User getUser(long id);

    User createUser(User user);

    User updateUser(User user);

    boolean removeUser(long id);

    ArrayList<User> getAllUsers();

    ArrayList<User> getMajorUsers();
}
