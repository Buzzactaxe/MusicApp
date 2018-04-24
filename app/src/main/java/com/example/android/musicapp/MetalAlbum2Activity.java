package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MetalAlbum2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs);

        //Create an Array of songs for Horizons
        ArrayList<SongsMethod> Songs = new ArrayList<>();

        Songs.add(new SongsMethod("Bullet Dide", "In Flames", R.drawable.clayman));
        Songs.add(new SongsMethod("Pinball Map", "In Flames", R.drawable.clayman));
        Songs.add(new SongsMethod("Only for the Weak", "In Flames", R.drawable.clayman));
        Songs.add(new SongsMethod("...as the Future Repeats Today", "In Flames", R.drawable.clayman));
        Songs.add(new SongsMethod("Square Nothing", "In Flames", R.drawable.clayman));
        Songs.add(new SongsMethod("Clayman", "In Flames", R.drawable.clayman));
        Songs.add(new SongsMethod("Satellites and Astronauts", "In Flames", R.drawable.clayman));
        Songs.add(new SongsMethod("Brush the Dust Away", "In Flames", R.drawable.clayman));
        Songs.add(new SongsMethod("Swim", "In Flames", R.drawable.clayman));
        Songs.add(new SongsMethod("Suburban Me", "In Flames", R.drawable.clayman));
        Songs.add(new SongsMethod("Another Day in Quicksand", "In Flames", R.drawable.clayman));


        SongAdapter songAdapter = new SongAdapter(this, Songs);

        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

        //Make a toast when clicking on song View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MetalAlbum2Activity.this, "How many metalheads does it take to change a light bulb?\n" +
                        "None. They embrace the darkness.", Toast.LENGTH_LONG).show();
            }
        });
    }
}
