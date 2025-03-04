package document;

import visitor.Visitor;

public interface DocumentElement {
   
    public DocumentElement accept(Visitor visitor);
    public boolean hasChild();
}

