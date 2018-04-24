package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MetalAlbum1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs);

        //Create an Array of songs for Horizons
        ArrayList<SongsMethod> Songs = new ArrayList<>();

        Songs.add(new SongsMethod("Begin", "Parkway Drive", R.drawable.horizons));
        Songs.add(new SongsMethod("The Sirens´ Song", "Parkway Drive", R.drawable.horizons));
        Songs.add(new SongsMethod("Feed Them to the Pigs", "Parkway Drive", R.drawable.horizons));
        Songs.add(new SongsMethod("Carrion", "Parkway Drive", R.drawable.horizons));
        Songs.add(new SongsMethod("Five Months", "Parkway Drive", R.drawable.horizons));
        Songs.add(new SongsMethod("Boneyards", "Parkway Drive", R.drawable.horizons));
        Songs.add(new SongsMethod("Idols and Anchors", "Parkway Drive", R.drawable.horizons));
        Songs.add(new SongsMethod("Moments in Oblivion", "Parkway Drive", R.drawable.horizons));
        Songs.add(new SongsMethod("Breaking Point", "Parkway Drive", R.drawable.horizons));
        Songs.add(new SongsMethod("Dead Man´s Chest", "Parkway Drive", R.drawable.horizons));
        Songs.add(new SongsMethod("Frostbite", "Parkway Drive", R.drawable.horizons));
        Songs.add(new SongsMethod("Horizons", "Parkway Drive", R.drawable.horizons));


        SongAdapter songAdapter = new SongAdapter(this, Songs);

        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

        //Make a toast when clicking on song View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MetalAlbum1Activity.this, "No joke to be said, Best band ever!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
