package com.example.barclays.musicstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class CustomAdapter extends ArrayAdapter<Songs> {

    /**
     *
     * @param context context with the adapter
     * @param songsList ArrayList variable
     */
    CustomAdapter(Activity context, @NonNull ArrayList<Songs> songsList) {
        super(context, 0, songsList);
    }

    /**
     *
     * @param position position of a list item
     * @param listItemView views in the list item
     * @param parent the ViewGroup
     * @return listItemView
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View listItemView, @NonNull ViewGroup parent) {

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Songs currentSong = getItem(position);

        TextView idNumber = listItemView.findViewById(R.id.id_number);
        idNumber.setText(currentSong.getItemId());

        CircleImageView imageView = listItemView.findViewById(R.id.song_image);
        imageView.setImageResource(currentSong.getSongImage());

        TextView title = listItemView.findViewById(R.id.song_title);
        title.setText(currentSong.getSongTitle());

        TextView artist = listItemView.findViewById(R.id.artist);
        artist.setText(currentSong.getArtist());

        return listItemView;
    }


}//end of public class
