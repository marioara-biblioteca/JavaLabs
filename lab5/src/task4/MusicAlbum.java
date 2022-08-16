package task4;
import java.util.*;
abstract public class MusicAlbum implements Album{
    private ArrayList<Song>songs;
    public MusicAlbum(){
        songs=new ArrayList<>();
    }
    public ArrayList<Song> getSongs() {
        return songs;
    }
    public void removeSong(Song s){
        this.songs.remove(s);
    }

    @Override
    public String toString() {
        return "MusicAlbum{" +
                "songs=" + songs +
                '}';
    }
}
