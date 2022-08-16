package task1;
import task1.document.*;
import java.util.List;

/**
 * Uses visitors to parse documents and provide dokuwiki and markdown outputs.
 */
public class WikiGenerator {
    private final List<TextSegment> textSegments;

    public WikiGenerator(List<TextSegment> textSegments) {
        this.textSegments = textSegments;
    }

    public StringBuilder getDokuWikiDocument() {
        DokuWikiVisitor dkwVisitor=new DokuWikiVisitor();
        // TODO apply dokuwiki visitor on the text segments
        for(TextSegment segment:this.textSegments)
            segment.accept(dkwVisitor);
        return dkwVisitor.getDocument();
    }

    public StringBuilder getMarkdownDocument() {
        MarkDownVisitor mVisitor=new MarkDownVisitor();
        // TODO apply Markdown visitor on the text segments
        for(TextSegment segment:this.textSegments)
            segment.accept(mVisitor);
        return mVisitor.getDocument();
    }
}
