package task1;

import task1.document.BoldTextSegment;
import task1.document.ItalicTextSegment;
import task1.document.PlainTextSegment;
import task1.document.UrlSegment;

public interface Visitor {
    void visit(ItalicTextSegment italic);
    void  visit(BoldTextSegment bold);
    void visit(UrlSegment url);
    void visit(PlainTextSegment plain);
}
