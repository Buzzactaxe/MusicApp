package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PopAlbum1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs);

        //Create an Array of songs for FutureSex / LoveSounds
        ArrayList<SongsMethod> Songs = new ArrayList<>();

        Songs.add(new SongsMethod("FutureSex / LoveSounds", "Justin Timberlake", R.drawable.futuresex));
        Songs.add(new SongsMethod("Sexy Back", "Justin Timberlake", R.drawable.futuresex));
        Songs.add(new SongsMethod("Medley: Sexy Ladies / Let Me Talk to You", "Justin Timberlake", R.drawable.futuresex));
        Songs.add(new SongsMethod("My Love (feat. T.I.)", "Justin Timberlake", R.drawable.futuresex));
        Songs.add(new SongsMethod("LoveStoned / I Think She Knows (Interlude)", "Justin Timberlake", R.drawable.futuresex));
        Songs.add(new SongsMethod("What Goes Around.../...Comes Around ", "Justin Timberlake", R.drawable.futuresex));
        Songs.add(new SongsMethod("Chop Me Up", "Justin Timberlake", R.drawable.futuresex));
        Songs.add(new SongsMethod("Damn Girl", "Justin Timberlake", R.drawable.futuresex));
        Songs.add(new SongsMethod("Medley: Summer Love / Set the Mood", "Justin Timberlake", R.drawable.futuresex));
        Songs.add(new SongsMethod("Until the End of Time", "Justin Timberlake", R.drawable.futuresex));
        Songs.add(new SongsMethod("Losing My Way", "Justin Timberlake", R.drawable.futuresex));
        Songs.add(new SongsMethod("(Another Song) All Over Again", "Justin Timberlake", R.drawable.futuresex));


        SongAdapter songAdapter = new SongAdapter(this, Songs);

        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

        //Make a toast when clicking on song View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(PopAlbum1Activity.this, "Idea for a new Snickers commercial ~ Justin Bieber takes a bite, turns into Justin Timberlake.", Toast.LENGTH_LONG).show();
            }
        });
    }
}
