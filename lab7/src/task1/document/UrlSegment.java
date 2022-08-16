package task1.document;

import task1.DocumentVisitor;

public class UrlSegment extends TextSegment{
    private String url;
    public UrlSegment(String content,String url) {
        super(content);
        this.url=url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void accept(DocumentVisitor v) {
        v.visit(this);
    }
}
