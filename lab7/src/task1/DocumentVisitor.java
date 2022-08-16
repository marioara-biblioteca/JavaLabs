package task1;

import task1.document.PlainTextSegment;

public abstract class DocumentVisitor implements Visitor{
    private  StringBuilder content=new StringBuilder();

    public StringBuilder getDocument(){
        return this.content;
    }
    public void formDocument(StringBuilder inPlus){
        this.content.append(inPlus);
    }

    @Override
    public void visit(PlainTextSegment plain) {
        this.formDocument(new StringBuilder(plain.getContent()));
    }
}
