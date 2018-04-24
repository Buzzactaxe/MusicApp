package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HipHopAlbum1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs);

        //Create an Array of songs for Horizons
        ArrayList<SongsMethod> Songs = new ArrayList<>();

        Songs.add(new SongsMethod("The Chronic (Intro)", "Dr. Dre", R.drawable.thechronic));
        Songs.add(new SongsMethod("Fuck Wit Dre Day (And Everybody's Celebratin')", "Dr. Dre", R.drawable.thechronic));
        Songs.add(new SongsMethod("Let Me Ride", "Dr. Dre", R.drawable.thechronic));
        Songs.add(new SongsMethod("The Day The Niggaz Took Over", "Dr. Dre", R.drawable.thechronic));
        Songs.add(new SongsMethod("Nuthin' but a G Thang", "Dr. Dre", R.drawable.thechronic));
        Songs.add(new SongsMethod("Deeez Nuuuts", "Dr. Dre", R.drawable.thechronic));
        Songs.add(new SongsMethod("Lil' Ghetto Boy", "Dr. Dre", R.drawable.thechronic));
        Songs.add(new SongsMethod("A Nigga Witta Gun", "Dr. Dre", R.drawable.thechronic));
        Songs.add(new SongsMethod("Rat-tat-tat-tat", "Dr. Dre", R.drawable.thechronic));
        Songs.add(new SongsMethod("The $20 sack pyramid", "Dr. Dre", R.drawable.thechronic));
        Songs.add(new SongsMethod("Lyrical Gangbang", "Dr. Dre", R.drawable.thechronic));
        Songs.add(new SongsMethod("High Powered", "Dr. Dre", R.drawable.thechronic));
        Songs.add(new SongsMethod("Stranded on Death Row", "Dr. Dre", R.drawable.thechronic));
        Songs.add(new SongsMethod("The Roach (The Chronic Outro)", "Dr. Dre", R.drawable.thechronic));
        Songs.add(new SongsMethod("Bitches Ain't Shit", "Dr. Dre", R.drawable.thechronic));


        SongAdapter songAdapter = new SongAdapter(this, Songs);

        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

        //Make a toast when clicking on song View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(HipHopAlbum1Activity.this, "How did Dr. Dre meet Eminem & 50 cent? \n" + "Dr. Dre bought M&Ms for 50 cents...", Toast.LENGTH_LONG).show();
            }
        });
    }
}
