package com.example.barclays.musicstructureapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        TextView artistBox = findViewById(R.id.echo_artist);
        TextView titleBox = findViewById(R.id.echo_title);
        CircleImageView imageBox = findViewById(R.id.echo_image);

        /*
         * Retrieving contents of the ArrayList fron the MainActivity class
         */
        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String text = extras.getString("title");
            titleBox.setText(text);

            String text2 = extras.getString("artist");
            artistBox.setText(text2);

            int myImage = extras.getInt("image");
            imageBox.setImageResource(myImage);

        }

    }//end of onCreate

}//end of public class
