package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Button signInButton = findViewById(R.id.signInButton);


        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent signInIntent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(signInIntent);
            }
        });


        Button registerButton = findViewById(R.id.registerButton);


        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent registerIntent = new Intent(HomeActivity.this, ReggisterActivity.class);
                startActivity(registerIntent);
            }
        });


        ImageView logoImageView = findViewById(R.id.logoImageView);


        logoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mainPageIntent = new Intent(HomeActivity.this, MainPageActivity.class);
                startActivity(mainPageIntent);
            }
        });

        // Add the rest of your code to initialize UI components, set logos, introductions, buttons, etc.
    }
}
