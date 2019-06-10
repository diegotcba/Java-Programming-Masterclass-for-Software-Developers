package com.diegot;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by DiegoT on 10/06/2019.
 */
public class Album {
    private String title;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) {
            System.out.println(title + " is already on the album");
            return false;
        }

        this.songs.add(new Song(title, duration));
        return true;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
        Song foundSong = findSong(songTitle);

        if (foundSong == null) {
            System.out.println(songTitle + " not found in the album");
            return false;
        }

        playList.add(foundSong);
        return true;
    }

    public boolean addToPlayList(int songNumber, LinkedList<Song> playList) {
        if (songNumber > 0 && songNumber <= this.songs.size()) {
            playList.add(this.songs.get(songNumber-1));
            return true;
        }

        System.out.println("This album doesn't have a track " + songNumber);
        return false;
    }

    private Song findSong(String songTitle) {
        for (Song song : this.songs) {
            if (song.getTitle().equals(songTitle)) {
                return song;
            }
        }

        return null;
    }
}
