package task1.document;

public abstract class TextSegment implements Visitable{
    private String content;

    public TextSegment(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
