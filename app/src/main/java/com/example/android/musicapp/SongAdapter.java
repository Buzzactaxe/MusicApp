package com.example.android.musicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<SongsMethod>{

    public SongAdapter(Activity context, ArrayList<SongsMethod> categories) {
        // Initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, categories);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Check if the existing view is being reused, otherwise inflates the view.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list, parent, false);
        }

        SongsMethod currentSong = getItem(position);

        TextView artistTextView = listItemView.findViewById(R.id.artistView);

        artistTextView.setText(currentSong.getArtistName());

        TextView songTextView = listItemView.findViewById(R.id.songView);

        songTextView.setText(currentSong.getSongName());

        ImageView albumView = listItemView.findViewById(R.id.albumView);

        albumView.setImageResource(currentSong.getImageResourceId());


        // Returns the whole list item layout (2 TextViews)
        return listItemView;

    }

}


