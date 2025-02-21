package document;

import visitor.Visitor;

public interface DocumentElement {
	
    public String render();
    
    public void accept(Visitor visitor);
}

