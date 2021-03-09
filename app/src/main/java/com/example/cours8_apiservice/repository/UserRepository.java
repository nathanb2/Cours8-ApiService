package com.example.cours8_apiservice.repository;

import com.example.cours8_apiservice.api_service.FakeUserApiService;
import com.example.cours8_apiservice.api_service.UserApiService;
import com.example.cours8_apiservice.model.User;

import java.util.ArrayList;

/**
 * En charge de fournir les donnees a la class qui les affiche (ici MainActivity)
 * Main activity ne connait que UserRepository et ne s'interesse pas a d'ou UserRepository amene les donnees
 * UserRepository est donc responsable de fournir les donnees a la classe qui les affiches et ramener les donnees de la ou elles se trouvent
 *
 *  (UserRepository peut aussi ramene les donnees selon une certaine logique, par exemple si on a une DB local que l'on depuis un server,
 * UserRepository peut choisir selon un delais de rafraichissement des donnees
 * de ramener les donnees depuis le server (et les inserer dans la Db) ou uniquement de ramener les donnees depuis la DB)
 */
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
