package task4;

public class Song {
    private String name;
    private String composer;
    private int id;

    public Song(String name, int id,String composer) {
        this.name = name;
        this.composer = composer;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getComposer() {
        return composer;
    }
    public int getId() {
        return id;
    }

}
