package com.example.splashscreen;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class RecyclingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycling_main);


        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) VideoView videoView = findViewById(R.id.videoView);


        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.sample_video;
        Uri videoUri = Uri.parse(videoPath);
        videoView.setVideoURI(videoUri);


        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);


        videoView.start();


        ImageView logoImageView = findViewById(R.id.imageView);


        logoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent homeIntent = new Intent(RecyclingActivity.this, MainPageActivity.class);
                startActivity(homeIntent);
            }
        });
    }
}
