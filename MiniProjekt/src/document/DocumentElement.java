package document;

import visitor.Visitor;

public interface DocumentElement {
   
    public void accept(Visitor visitor);
    
}

