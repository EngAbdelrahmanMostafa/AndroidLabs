package com.iti.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageLoader extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_loader);

        ImageView imageView = findViewById(R.id.imageView);
        Picasso.with(this)
                .load("https://media.geeksforgeeks.org/wp-content/cdn-uploads/logo-new-2.svg")
                .into(imageView);
    }
}