package com.example.splashscreen;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MapActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        Button btnShowImage = findViewById(R.id.btnShowMap);
        imageView = findViewById(R.id.mapView);

        btnShowImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showImage();
            }
        });
    }

    private void showImage() {

        imageView.setImageResource(R.drawable.map);
        imageView.setVisibility(View.VISIBLE);
    }
}