package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class RockAlbum2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs);

        //Create an Array of songs for Skin&Bones
        ArrayList<SongsMethod> Songs = new ArrayList<>();

        Songs.add(new SongsMethod("A Kind of Magic (Live)", "Foo Fighters", R.drawable.skin_bones));
        Songs.add(new SongsMethod("Over and Out (Live)", "Foo Fighters", R.drawable.skin_bones));
        Songs.add(new SongsMethod("Walking After You (Live)", "Foo Fighters", R.drawable.skin_bones));
        Songs.add(new SongsMethod("Marigold", "Foo Fighters", R.drawable.skin_bones));
        Songs.add(new SongsMethod("My Hero (Live)", "Foo Fighters", R.drawable.skin_bones));
        Songs.add(new SongsMethod("Next Year (Live)", "Foo Fighters", R.drawable.skin_bones));
        Songs.add(new SongsMethod("Another Round (Live)", "Foo Fighters", R.drawable.skin_bones));
        Songs.add(new SongsMethod("Big Me (Live)", "Foo Fighters", R.drawable.skin_bones));
        Songs.add(new SongsMethod("Cold Day in the Sun (Live)", "Foo Fighters", R.drawable.skin_bones));
        Songs.add(new SongsMethod("Skin and Bones", "Foo Fighters", R.drawable.skin_bones));
        Songs.add(new SongsMethod("Febbuary Stars (Live)", "Foo Fighters", R.drawable.skin_bones));
        Songs.add(new SongsMethod("Times like These (Live)", "Foo Fighters", R.drawable.skin_bones));
        Songs.add(new SongsMethod("Friend of a Friend (Live)", "Foo Fighters", R.drawable.skin_bones));
        Songs.add(new SongsMethod("Best of You (Live)", "Foo Fighters", R.drawable.skin_bones));
        Songs.add(new SongsMethod("Everlong (Live)", "Foo Fighters", R.drawable.skin_bones));
        Songs.add(new SongsMethod("A Kind of Magic (Live)", "Foo Fighters", R.drawable.skin_bones));


        SongAdapter songAdapter = new SongAdapter(this, Songs);

        // Get a reference to the ListView and attach the adapter to the listView
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(songAdapter);

        //Make a toast when clicking on song View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(RockAlbum2Activity.this, "Long Live Live", Toast.LENGTH_SHORT).show();
            }
        });

    }

}

