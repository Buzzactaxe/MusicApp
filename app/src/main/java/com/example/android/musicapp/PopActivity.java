package com.example.android.musicapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        //find ImageView for Pop1Activity
        ImageView ImageView = findViewById(R.id.TBalbum);

        //Set onClickListener for PopAlbum1Activity
        ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ImageIntent = new Intent(PopActivity.this, PopAlbum1Activity.class);

                ////Start RockActivity intent
                startActivity(ImageIntent);
            }
        });

        //find TextView for Timberlake
        TextView textView = findViewById(R.id.timberlake);

        //Set onClickListener for Timberlake
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TimberlalkeIntent = new Intent(PopActivity.this, PopAlbum1Activity.class);

                ////Start PopActivity intent
                startActivity(TimberlalkeIntent);
            }
        });

        //find TextView for future/Sex
        TextView futureSex = findViewById(R.id.futureSex);

        //Set onClickListener for future/Sex
        futureSex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent futureSexIntent = new Intent(PopActivity.this, PopAlbum1Activity.class);

                ////Start futureSex Intent
                startActivity(futureSexIntent);
            }
        });

        //find ImageView for Maroon 5
        ImageView overExposed = findViewById(R.id.overEX);

        //Set onClickListener for overexposed
        overExposed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent overExposedIntent = new Intent(PopActivity.this, PopAlbum2Activity.class);

                ////Start OverExposedIntent
                startActivity(overExposedIntent);
            }
        });

        //find TextView for Maroon 5
        TextView maroon_5 = findViewById(R.id.maroon_5);

        //Set onClickListener for Maroon 5
        maroon_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maroon_5_Intent = new Intent(PopActivity.this, PopAlbum2Activity.class);

                //Start Maroon 5 Intent
                startActivity(maroon_5_Intent);
            }
        });

        //find TextView for SticksAndBones
        TextView overExposed_album = findViewById(R.id.textview);

        //Set onClickListener for SticksAndBones
        overExposed_album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent overexposedIntent = new Intent(PopActivity.this, PopAlbum2Activity.class);

                ////Start SticksAndBones Intent
                startActivity(overexposedIntent);
            }
        });
    }
}
