package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_main);

        TextView txtWelcome = findViewById(R.id.textView2);
        Button btnNext = findViewById(R.id.btn_np);


        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mainPageIntent = new Intent(WelcomeActivity.this, MainPageActivity.class);
                startActivity(mainPageIntent);
            }
        });
    }
}
