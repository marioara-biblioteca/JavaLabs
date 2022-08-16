package task1.document;

import task1.DocumentVisitor;

public interface Visitable {
    public void accept(DocumentVisitor v);
}
