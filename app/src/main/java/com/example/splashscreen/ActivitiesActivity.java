package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.ImageView;

public class ActivitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activities_main);


        ImageView logoImageView = findViewById(R.id.imageView);

        logoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mainPageIntent = new Intent(ActivitiesActivity.this, MainPageActivity.class);
                startActivity(mainPageIntent);


                finish();
            }
        });
    }

    public void onLinkClicked(View view) {
        int clickedButtonId = view.getId();
        String url = "";

        if (clickedButtonId == R.id.button) {
            url = "https://kids.nationalgeographic.com/games/action-adventure/article/recycle-roundup-new";
        } else if (clickedButtonId == R.id.button2) {
            url = "https://www.turtlediary.com/game/recycling-waste.html";
        } else if (clickedButtonId == R.id.button3) {
            url = "https://eco-cycleco.recycle.game/";
        } else if (clickedButtonId == R.id.button4) {
            url = "https://www.marketjs.com/item/recycle-hero";
        } else if (clickedButtonId == R.id.button5) {
            url = "https://www.stopdisastersgame.org/stop_disasters/";
        }

        if (!url.isEmpty()) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);

            ProgressBar progressBar = findViewById(R.id.progressBar);
            progressBar.setProgress(progressBar.getProgress() + 20);
            progressBar.setVisibility(View.VISIBLE);
        }
    }
}
