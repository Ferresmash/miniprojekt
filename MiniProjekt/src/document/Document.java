package document;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import visitor.Visitor;

public class Document {

	private List<DocumentElement> elements;

	public Document() {
		this.elements = new ArrayList<>();
	}

	public void addElement(DocumentElement element) {
		if (element != null) {
			elements.add(element);
		}
	}

	public DocumentElement getElement(int index) {
		if (index < 0 || index >= elements.size()) {
			throw new IndexOutOfBoundsException("Index " + index + " är utanför gränserna.");
		}
		return elements.get(index);
	}

	public List<DocumentElement> getElements() {
		return Collections.unmodifiableList(elements);
	}

	public String render() {
		StringBuilder builder = new StringBuilder();
		for (DocumentElement element : elements) {
			builder.append(element.render()).append("\n");
		}
		return builder.toString();
	}
	
	public String render(Visitor visitor) {
		
	}
}
