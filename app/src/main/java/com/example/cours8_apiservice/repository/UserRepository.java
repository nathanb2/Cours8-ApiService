package com.example.cours8_apiservice.repository;

import com.example.cours8_apiservice.api_service.FakeUserApiService;
import com.example.cours8_apiservice.api_service.UserApiService;
import com.example.cours8_apiservice.model.User;

import java.util.ArrayList;

public class UserRepository implements UserApiService {

    UserApiService userApiService = new FakeUserApiService();

    public User getUser(long id){
        return userApiService.getUser(id);
    }

    public User createUser(User user){
        return userApiService.createUser(user);
    }

    public User updateUser(User user){
        return userApiService.updateUser(user);
    }

    public boolean removeUser(long id){
        return userApiService.removeUser(id);
    }

    public ArrayList<User> getAllUsers(){
        return userApiService.getAllUsers();
    }

    public ArrayList<User> getMajorUsers(){
        return userApiService.getMajorUsers();
    }
}
