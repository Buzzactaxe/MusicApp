package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HipHopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hip_hop);

        //find ImageView for Pop1Activity
        ImageView ImageView = findViewById(R.id.Dr__Dre_Aalbum);

        //Set onClickListener for PopAlbum1Activity
        ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ImageIntent = new Intent(HipHopActivity.this, HipHopAlbum1Activity.class);

                ////Start RockActivity intent
                startActivity(ImageIntent);
            }
        });

        //find TextView for Dr. Dre
        TextView textView = findViewById(R.id.Dr__Dre);

        //Set onClickListener for Dr. Dre
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DreIntent = new Intent(HipHopActivity.this, HipHopAlbum1Activity.class);

                ////Start PopActivity intent
                startActivity(DreIntent);
            }
        });

        //find TextView for future/Sex
        TextView the_chronic = findViewById(R.id.theChronic);

        //Set onClickListener for future/Sex
        the_chronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent the_chronicIntent = new Intent(HipHopActivity.this, HipHopAlbum1Activity.class);

                ////Start futureSex Intent
                startActivity(the_chronicIntent);
            }
        });

        //find ImageView for NWA
        ImageView straight_OOC = findViewById(R.id.NWD_Album);

        //Set onClickListener for Straight out of compton
        straight_OOC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent straight_OocIntent = new Intent(HipHopActivity.this, HipHopAlbum2Activity.class);

                ////Start OverExposedIntent
                startActivity(straight_OocIntent);
            }
        });

        //find TextView for NWA
        TextView NWA = findViewById(R.id.NWA);

        //Set onClickListener forNWA
        NWA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NWAIntent = new Intent(HipHopActivity.this, HipHopAlbum2Activity.class);

                //Start Maroon 5 Intent
                startActivity(NWAIntent);
            }
        });

        //find TextView for
        TextView NWA_album = findViewById(R.id.textview);

        //Set onClickListener for Straight out of compton
        NWA_album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NWAalbumIntent = new Intent(HipHopActivity.this, HipHopAlbum2Activity.class);

                ////Start Straight out of compton Intent
                startActivity(NWAalbumIntent);
            }
        });
    }
}
