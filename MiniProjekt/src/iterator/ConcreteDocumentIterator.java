package iterator;

import java.util.List;

import document.Document;
import document.DocumentElement;

public class ConcreteDocumentIterator implements DocumentIterator {

	private List<DocumentElement> elements;
    private int index = 0;
	
	public ConcreteDocumentIterator(Document document) {
		this.elements = document.getElements();
	}
	
	@Override
	public boolean hasNext() {
		return index < elements.size();
	}

	@Override
	public DocumentElement next() {
		if(!hasNext()) {
			throw new IllegalStateException();
		}
		DocumentElement currentElement = elements.get(index);
		index++;
		return currentElement; 
	}
}
