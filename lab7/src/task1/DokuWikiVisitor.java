package task1;

import task1.document.BoldTextSegment;
import task1.document.ItalicTextSegment;
import task1.document.PlainTextSegment;
import task1.document.UrlSegment;

public class DokuWikiVisitor extends DocumentVisitor{

    @Override
    public void visit(ItalicTextSegment italic) {
        StringBuilder aux=new StringBuilder("//");
        aux.append(italic.getContent());
        aux.append("//");
        this.formDocument(aux);
    }

    @Override
    public void visit(BoldTextSegment bold) {
        StringBuilder aux=new StringBuilder("**");
        aux.append(bold.getContent());
        aux.append("**");
        this.formDocument(aux);
    }

    @Override
    public void visit(UrlSegment url) {
        StringBuilder aux=new StringBuilder("[[");
        aux.append(url.getContent());
        aux.append("|");
        aux.append(url.getUrl());
        aux.append("]]");
        this.formDocument(aux);
    }

}
