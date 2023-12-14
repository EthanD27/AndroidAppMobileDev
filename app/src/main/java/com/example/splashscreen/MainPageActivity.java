package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage_activity);

        Button btnImp = findViewById(R.id.btn_imp);
        Button btnAct = findViewById(R.id.btn_act);
        Button btnNews = findViewById(R.id.btn_news);
        Button btnGoals = findViewById(R.id.btn_goals);
        Button btnMap = findViewById(R.id.btn_map);


        btnImp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainPageActivity.this, RecyclingActivity.class);
                startActivity(intent);
            }
        });


        btnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainPageActivity.this, NewsActivity.class);
                startActivity(intent);
            }
        });


        btnAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainPageActivity.this, ActivitiesActivity.class);
                startActivity(intent);
            }
        });


        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainPageActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });

        btnGoals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainPageActivity.this, GoalsActivity.class);
                startActivity(intent);
            }
        });

    }
}