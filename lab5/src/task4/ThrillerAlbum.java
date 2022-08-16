package task4;

public class ThrillerAlbum extends MusicAlbum{
    @Override
    public void addSong(Song s) {
        if(s.getComposer()=="Michael Jackson" & s.getId()%2==0)
            getSongs().add(s);
        else System.out.println("Only songs written by Michael Jackson with even id belong to Thriller album");
    }
}
