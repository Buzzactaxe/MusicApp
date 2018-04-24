package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PopAlbum2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs);

        //Create an Array of songs for Overexposed
        ArrayList<SongsMethod> Songs = new ArrayList<>();

        Songs.add(new SongsMethod("One More Night", "Maroon 5", R.drawable.overexposed));
        Songs.add(new SongsMethod("Payphone", "Maroon 5", R.drawable.overexposed));
        Songs.add(new SongsMethod("Daylight", "Maroon 5", R.drawable.overexposed));
        Songs.add(new SongsMethod("Lucky Strike", "Maroon 5", R.drawable.overexposed));
        Songs.add(new SongsMethod("The Man Who Never Lied", "Maroon 5", R.drawable.overexposed));
        Songs.add(new SongsMethod("Love Somebody", "Maroon 5", R.drawable.overexposed));
        Songs.add(new SongsMethod("Ladykiller", "Maroon 5", R.drawable.overexposed));
        Songs.add(new SongsMethod("Fortune Teller", "Maroon 5", R.drawable.overexposed));
        Songs.add(new SongsMethod("Sad", "Maroon 5", R.drawable.overexposed));
        Songs.add(new SongsMethod("Doin´ Dirt", "Maroon 5", R.drawable.overexposed));
        Songs.add(new SongsMethod("Wipe Your Eyes", "Maroon 5", R.drawable.overexposed));
        Songs.add(new SongsMethod("Waisted Years", "Maroon 5", R.drawable.overexposed));
        Songs.add(new SongsMethod("Let´s Stay Together", "Maroon 5", R.drawable.overexposed));
        Songs.add(new SongsMethod("One More Night (Sticky K remix)", "Maroon 5", R.drawable.overexposed));


        SongAdapter songAdapter = new SongAdapter(this, Songs);

        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

        //Make a toast when clicking on song View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(PopAlbum2Activity.this, "If I was held at gun point and asked to tell the difference between one Maroon 5 song over another, I'd be shot!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
