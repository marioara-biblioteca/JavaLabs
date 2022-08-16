package task1;

import task1.document.BoldTextSegment;
import task1.document.ItalicTextSegment;
import task1.document.PlainTextSegment;
import task1.document.UrlSegment;

public class MarkDownVisitor extends DocumentVisitor {


    @Override
    public void visit(ItalicTextSegment italic) {
       StringBuilder aux= new StringBuilder("_");
       aux.append(italic.getContent());
       aux.append("_");
       this.formDocument(aux);
    }

    @Override
    public void visit(BoldTextSegment bold) {
        StringBuilder aux=new StringBuilder("__");
        aux.append(bold.getContent());
        aux.append("__");
        this.formDocument(aux);
    }

    @Override
    public void visit(UrlSegment url) {
        StringBuilder aux=new StringBuilder("[");
        aux.append(url.getUrl());
        aux.append("](");
        aux.append(url.getContent());
        aux.append(")");
        this.formDocument(aux);
    }

}
