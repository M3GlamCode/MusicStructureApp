package com.example.barclays.musicstructureapp;

public class Songs {

    private String itemId;
    private String songTitle;
    private String artist;
    private int songImage;

    /**
     *
     * @param mId Indicates position of the list item starting from 1
     * @param mTitle The title of the song
     * @param mArtist The name of the song Artist
     * @param mImage The image associated with the song
     */
    Songs(String mId, String mTitle, String mArtist, int mImage){
        itemId = mId;
        songTitle = mTitle;
        artist = mArtist;
        songImage = mImage;

    }

    //get methods
    public String getItemId(){
        return itemId;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongImage() {
        return songImage;
    }

}//end of public class
