package com.example.cours8_apiservice.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.cours8_apiservice.R;
import com.example.cours8_apiservice.model.User;
import com.example.cours8_apiservice.repository.UserRepository;

/**
 * Charger d'afficher (ou de creer des donnees mais apriori le fera suite a une interaction de 'utilisateur, ici create serait enrealite surement effecture quand un user click sur un bouton par exemple)
 * Ne connait que UserRepository a qui il indique ce qu'il veut faire des donnees mais pas les class d'ApiService qui elle sauvegarde les donnees et les manipules
 * mainActivity demande des donnees ou indique vouloire les modifier mais ne le fait pas directement et ne se soucie pas de comment c'est realise
 * (demain on peut changer toute le userApiService par une DB par exemple cela ne change rien pour MainActivity)
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserRepository userRepository = new UserRepository();

        userRepository.createUser(new User(0, "Patrick", 25));

        TextView textView = findViewById(R.id.AM_tv);

        User user = userRepository.getUser(0);

        textView.setText(user.getName());
    }
}