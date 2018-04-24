package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class RockAlbum1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs);


        //Create an Array of songs for Meteora
        ArrayList<SongsMethod> Songs = new ArrayList<>();

        Songs.add(new SongsMethod("Foreword", "Linkin Park", R.drawable.meteora));
        Songs.add(new SongsMethod("Somewhere I belong", "Linkin Park", R.drawable.meteora));
        Songs.add(new SongsMethod("Lying From You", "Linkin Park", R.drawable.meteora));
        Songs.add(new SongsMethod("Hit The Floor", "Linkin Park", R.drawable.meteora));
        Songs.add(new SongsMethod("Easier To Run", "Linkin Park", R.drawable.meteora));
        Songs.add(new SongsMethod("Faint", "Linkin Park", R.drawable.meteora));
        Songs.add(new SongsMethod("Figure.09", "Linkin Park", R.drawable.meteora));
        Songs.add(new SongsMethod("Breaking The Habit", "Linkin Park", R.drawable.meteora));
        Songs.add(new SongsMethod("From The Inside", "Linkin Park", R.drawable.meteora));
        Songs.add(new SongsMethod("Nobody´s Listening", "Linkin Park", R.drawable.meteora));
        Songs.add(new SongsMethod("Session", "Linkin Park", R.drawable.meteora));
        Songs.add(new SongsMethod("Numb", "Linkin Park", R.drawable.meteora));


        SongAdapter songAdapter = new SongAdapter(this, Songs);

        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

        //Make a toast when clicking on song View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(RockAlbum1Activity.this, "In Memory of Chester, RIP.", Toast.LENGTH_LONG).show();
            }
        });

    }

}
