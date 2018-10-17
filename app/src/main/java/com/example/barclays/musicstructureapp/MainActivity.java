package com.example.barclays.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         * ArrayList of list of songs
         * Songs is a class
         */
        final ArrayList<Songs> songsList = new ArrayList<>();
        songsList.add(new Songs("1","Tujiangalie", "Sauti Sol", R.drawable.tujiangalie));
        songsList.add(new Songs("2","Fine girl", "Zie Zie", R.drawable.ziezie));
        songsList.add(new Songs("3","2 in 1", "Naiboi", R.drawable.naiboi));
        songsList.add(new Songs("4","Chaguo la Moyo", "Otile Brown & Sanaipei", R.drawable.chaguolamoyo));
        songsList.add(new Songs("5","Short and Sweet", "Sauti Sol", R.drawable.shortsweet));
        songsList.add(new Songs("6","China Love", "Victoria Kimani", R.drawable.chinalove));
        songsList.add(new Songs("7","Melanin", "Sauti Sol", R.drawable.melanin));
        songsList.add(new Songs("8","Boomerang", "Jidenna", R.drawable.boomerang));
        songsList.add(new Songs("9","Hello", "Nyashinski", R.drawable.nyash));
        songsList.add(new Songs("10","Baby Love", "Otile Brown", R.drawable.babylove));

        /*
          Setting up a custom adapter
         */
        CustomAdapter adapter = new CustomAdapter(this, songsList);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        /*
         * Passing contents of the ArrayList to the next activity (NowPlayingActivity)
         */
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String title = String.valueOf(songsList.get(position).getSongTitle());
                String artist = String.valueOf(songsList.get(position).getArtist());
                int image = songsList.get(position).getSongImage();

                Intent i = new Intent(MainActivity.this, NowPlayingActivity.class);
                i.putExtra("title", title);
                i.putExtra("artist", artist);
                i.putExtra("image", image);
                startActivity(i);

            }
        });

    }//end of onCreate

}//end of public class
