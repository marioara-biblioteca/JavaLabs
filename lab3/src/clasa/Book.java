package clasa;

public class Book {
    private String title;
    private Page[]pages;
    private Shelf shelf=null;

    public Book(String title, int size, Shelf shelf) {
        this.title = title;
        this.pages = new Page[size];
        this.shelf = shelf;
        for(int i=0;i<size;i++){
            this.pages[i]=new Page("Page "+Integer.toString(i),i);
        }
    }
}
