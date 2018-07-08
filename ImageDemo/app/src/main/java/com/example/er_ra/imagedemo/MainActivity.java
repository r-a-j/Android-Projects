package com.example.er_ra.imagedemo;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void switchCat(View view) {

        ImageView image = (ImageView) findViewById(R.id.cat1ImageView);
        image.setImageResource(R.drawable.cat3);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
