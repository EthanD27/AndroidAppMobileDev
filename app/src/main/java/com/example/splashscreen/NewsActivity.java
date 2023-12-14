package com.example.splashscreen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_main);

        TextView txtNews = findViewById(R.id.txt_news);
        Button btnUNN = findViewById(R.id.btn_unn);


        ImageView logoImageView = findViewById(R.id.imageView2);


        txtNews.setText("The deal, which is expected to be completed in the second quarter of 2024, will see all of Urbaser’s UK contracts and waste facilities transfer to FCC Environment. \n" +
                "\n" +
                "This includes facilities of composting, material recovery, waste to energy, final disposal and household recycling centres. It also provides waste collection, recycling centre management, street cleansing.");


        btnUNN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://news.sky.com/topic/recycling-7096";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        logoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mainPageIntent = new Intent(NewsActivity.this, MainPageActivity.class);
                startActivity(mainPageIntent);

                finish();
            }
        });
    }
}
