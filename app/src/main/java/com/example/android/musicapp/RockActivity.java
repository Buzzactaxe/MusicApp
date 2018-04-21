package com.example.android.musicapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);

        //find ImageView for RockAlbum1Activity
        ImageView LPAlbumImage = findViewById(R.id.LPalbum);

        //Set onClickListener for RockAlbum1Activity
        LPAlbumImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lpAlbumImageIntent = new Intent(RockActivity.this, RockAlbum1Activity.class);

                ////Start RockActivity intent
                startActivity(lpAlbumImageIntent);
            }
        });

        //find TextView for linkinPark
        TextView LinkinPark = findViewById(R.id.linkinPark);

        //Set onClickListener for linkinPark
        LinkinPark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lpIntent = new Intent(RockActivity.this, RockAlbum1Activity.class);

                ////Start RockActivity intent
                startActivity(lpIntent);
            }
        });

        //find TextView for hybridTheory
        TextView HybridTheory = findViewById(R.id.hybridTheory);

        //Set onClickListener for HybridTheory
        HybridTheory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hybridtheoryIntent = new Intent(RockActivity.this, RockAlbum1Activity.class);

                ////Start hybridTheory Intent
                startActivity(hybridtheoryIntent);
            }
        });

        //find ImageView for FooFightersAlbum
        ImageView FooFightersAlbumImage = findViewById(R.id.ffaalbum);

        //Set onClickListener for FooFightersAlbum
        FooFightersAlbumImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent FooFightersAlbumImageIntent = new Intent(RockActivity.this, RockAlbum2Activity.class);

                ////Start FooFightersAlbum intent
                startActivity(FooFightersAlbumImageIntent);
            }
        });

        //find TextView for fooFighters
        TextView fooFighters = findViewById(R.id.FooFighters);

        //Set onClickListener for FooFighters
        fooFighters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fooFightersIntent = new Intent(RockActivity.this, RockAlbum2Activity.class);

                ////Start FooFighters Intent
                startActivity(fooFightersIntent);
            }
        });

        //find TextView for SticksAndBones
        TextView sticksAndBones = findViewById(R.id.textview);

        //Set onClickListener for SticksAndBones
        sticksAndBones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SsticksAndBonesIntent = new Intent(RockActivity.this, RockAlbum2Activity.class);

                ////Start SticksAndBones Intent
                startActivity(SsticksAndBonesIntent);
            }
        });


    }
}
