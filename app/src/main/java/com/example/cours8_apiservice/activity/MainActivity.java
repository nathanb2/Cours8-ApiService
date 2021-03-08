package com.example.cours8_apiservice.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.cours8_apiservice.R;
import com.example.cours8_apiservice.model.User;
import com.example.cours8_apiservice.repository.UserRepository;

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