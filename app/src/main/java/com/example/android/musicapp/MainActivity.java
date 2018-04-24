package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find TextView for RockActivity
        TextView rockGenre = findViewById(R.id.rock);

        //Set onClickListener for RockActivity
        rockGenre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);

                ////Start RockActivity intent
                startActivity(rockIntent);
            }
        });

        //find TextView for PopActivity
        TextView PopGenre = findViewById(R.id.Pop);

        //Set onClickListener for PopActivity
        PopGenre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);

                ////Start PopActivity intent
                startActivity(popIntent);
            }
        });

        //find TextView for MetalActivity
        TextView MetalGenre = findViewById(R.id.Metal);

        //Set onClickListener for MetalActivity
        MetalGenre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MetalIntent = new Intent(MainActivity.this, MetalActivity.class);

                ////Start MetalActivity intent
                startActivity(MetalIntent);
            }
        });

        //find TextView for HipHopActivity
        TextView hipHopGenre = findViewById(R.id.HipHop);

        //Set onClickListener for HipHopActivity
        hipHopGenre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hipHopIntent = new Intent(MainActivity.this, HipHopActivity.class);

                ////Start HipHopActivity intent
                startActivity(hipHopIntent);
            }
        });

        // Get imageview for the play button activity_main
        ImageView playButton = findViewById(R.id.playbutton);

        // Setup OnClickListener for play button
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Make toast for play button
                Toast.makeText(MainActivity.this, "Nothing to play, move on.", Toast.LENGTH_SHORT).show();
            }
        });

        // Get imageview for the pause button activity_main
        ImageView pauseButton = findViewById(R.id.pausbutton);

        // Setup OnClickListener for pause button
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Make toast for pause button
                Toast.makeText(MainActivity.this, "How do you want to pause with nothing to play?!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
