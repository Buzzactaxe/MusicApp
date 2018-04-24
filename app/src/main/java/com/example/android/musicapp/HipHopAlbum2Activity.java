package com.example.android.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HipHopAlbum2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs);


        //Create an Array of songs for Horizons
        ArrayList<SongsMethod> Songs = new ArrayList<>();

        Songs.add(new SongsMethod("Straight Outta Compton", "N.W.A.", R.drawable.nwa));
        Songs.add(new SongsMethod("Fuck Tha Police", "N.W.A.", R.drawable.nwa));
        Songs.add(new SongsMethod("Gangsta Gangsta", "N.W.A.", R.drawable.nwa));
        Songs.add(new SongsMethod("If It Ain’t Ruff", "N.W.A.", R.drawable.nwa));
        Songs.add(new SongsMethod("Parental Discretion Iz Advised", "N.W.A.", R.drawable.nwa));
        Songs.add(new SongsMethod("Express Yourself", "N.W.A.", R.drawable.nwa));
        Songs.add(new SongsMethod("Compton’s N the House (remix)", "N.W.A.", R.drawable.nwa));
        Songs.add(new SongsMethod("I Ain’t tha 1", "N.W.A.", R.drawable.nwa));
        Songs.add(new SongsMethod("Dopeman (remix)", "N.W.A.", R.drawable.nwa));
        Songs.add(new SongsMethod("Quiet on tha Set", "N.W.A.", R.drawable.nwa));


        SongAdapter songAdapter = new SongAdapter(this, Songs);

        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

        //Make a toast when clicking on song View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(HipHopAlbum2Activity.this, "VALLIANT: What kind of music does a kangaroo listen to?\n" +
                        "DENISE: I have no idea.\n" +
                        "VALLIANT: Hip-hop!", Toast.LENGTH_LONG).show();
            }
        });

    }
}
