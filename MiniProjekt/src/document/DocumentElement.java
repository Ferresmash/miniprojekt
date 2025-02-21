package document;

import visitor.Visitor;

public interface DocumentElement {
   
    public String accept(Visitor visitor);
}

