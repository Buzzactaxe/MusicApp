package com.example.android.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MetalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metal);

        //find ImageView for MetalAlbum1Activity
        ImageView ImageView = findViewById(R.id.PWDalbum);

        //Set onClickListener for MetalAlbum1Activity
        ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ImageIntent = new Intent(MetalActivity.this, MetalAlbum1Activity.class);

                ////Start RockActivity intent
                startActivity(ImageIntent);
            }
        });

        //find TextView for Parkway Drive
        TextView textView = findViewById(R.id.parkwayDrive);

        //Set onClickListener for parkway Drive
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent parkwayIntent = new Intent(MetalActivity.this, MetalAlbum1Activity.class);

                ////Start PopActivity intent
                startActivity(parkwayIntent);
            }
        });

        //find TextView for horizons
        TextView futureSex = findViewById(R.id.horizons);

        //Set onClickListener for future/Sex
        futureSex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent horizonsIntent = new Intent(MetalActivity.this, MetalAlbum1Activity.class);

                ////Start futureSex Intent
                startActivity(horizonsIntent);
            }
        });

        //find ImageView for in Flames
        ImageView overExposed = findViewById(R.id.clayman);

        //Set onClickListener for in Flames
        overExposed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inFlamesIntent = new Intent(MetalActivity.this, MetalAlbum2Activity.class);

                ////Start OverExposedIntent
                startActivity(inFlamesIntent);
            }
        });

        //find TextView for In Flames
        TextView maroon_5 = findViewById(R.id.in_flames);

        //Set onClickListener forIn Flames
        maroon_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_FlamesIntent = new Intent(MetalActivity.this, MetalAlbum2Activity.class);

                //Start Maroon 5 Intent
                startActivity(in_FlamesIntent);
            }
        });

        //find TextView for clayman
        TextView clayman_album = findViewById(R.id.textview);

        //Set onClickListener for SticksAndBones
        clayman_album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent claymanIntent = new Intent(MetalActivity.this, MetalAlbum2Activity.class);

                ////Start SticksAndBones Intent
                startActivity(claymanIntent);
            }
        });

    }
}
