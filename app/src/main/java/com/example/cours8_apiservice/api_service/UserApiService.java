package com.example.cours8_apiservice.api_service;

import com.example.cours8_apiservice.model.User;

import java.util.ArrayList;

public interface UserApiService {

    User getUser(long id);

    User createUser(User user);

    User updateUser(User user);

    boolean removeUser(long id);

    ArrayList<User> getAllUsers();

    ArrayList<User> getMajorUsers();
}
