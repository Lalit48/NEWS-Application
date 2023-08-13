package com.example1.newsmyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example1.newsmyapplication.Models.Newsheadline;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {
    Newsheadline headlines;
    TextView txt_title,txt_author,txt_time,txt_detail,txt_content;
    ImageView img_news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        txt_title = findViewById(R.id.text_detail_tital);
        txt_author = findViewById(R.id.text_detail_auther);
        txt_detail = findViewById(R.id.text_detail_detail);
        txt_content = findViewById(R.id.text_detail_content);
        txt_time = findViewById(R.id.text_detail_time);
        img_news = findViewById(R.id.img_detail_news);

        headlines = (Newsheadline) getIntent().getSerializableExtra("data");

        txt_title.setText(headlines.getTitle());
        txt_author.setText(headlines.getAuthor());
        txt_detail.setText(headlines.getDescription());
        txt_content.setText(headlines.getContent());
        txt_time.setText(headlines.getPublishedAt());
        Picasso.get().load(headlines.getUrlToImage()).into(img_news);
    }
}