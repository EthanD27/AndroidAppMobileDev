package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ReggisterActivity extends AppCompatActivity {
    DatabaseHelper db;
    EditText txtUsername, txtPassword;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reg_activity);

        db = new DatabaseHelper(this);
        txtUsername = findViewById(R.id.username_txt);
        txtPassword = findViewById(R.id.password_txt);

        btnRegister = findViewById(R.id.register_btn);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();

                if(username.equals("") || password.equals("")) {
                    Toast.makeText(getApplicationContext(), "Fields are empty!", Toast.LENGTH_SHORT).show();
                } else {
                    Boolean checkUsername = db.checkUsername(username);
                    if (checkUsername) {
                        Boolean insert = db.insert(username, password);
                        Toast.makeText(getApplicationContext(), "Register Successful!", Toast.LENGTH_SHORT).show();

                        startActivity(new Intent(ReggisterActivity.this, LoginActivity.class));
                        finish();
                    } else {
                        Toast.makeText(getApplicationContext(), "User Already Exists!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
