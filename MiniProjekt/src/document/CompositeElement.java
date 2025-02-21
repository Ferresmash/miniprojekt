package document;

public interface CompositeElement {


    void add(DocumentElement element);

    void remove(DocumentElement element);

    DocumentElement getChild(int index);

	
}
