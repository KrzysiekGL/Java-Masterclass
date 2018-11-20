package pw.szczerbowski;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Album {
    private String albumName;
    private ArrayList<Song> songs;

    public Album(String albumName) {
        songs=new ArrayList<Song>();
        this.albumName=albumName;
    }

    public void addSongToAlbum(String name, int duration) {
        songs.add(new Song(name, duration));
        System.out.println("Song " + name + " added to " + albumName);
    }

    public String getAlbumName() {
        return albumName;
    }
}
