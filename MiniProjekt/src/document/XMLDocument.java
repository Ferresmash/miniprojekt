package document;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class XMLDocument extends Document{
	
	private List<DocumentElement> elements;

	public XMLDocument() {
		this.elements = new ArrayList<>();
	}

	public void addElement(DocumentElement element) {
		if (element != null) {
			elements.add(element);
		}
	}
	public DocumentElement removeElement(int index) {
		if (index >= 0 && index < elements.size()) {
			return elements.remove(index);
		}
		return null;
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
			builder.append(element.toString()).append("\n");
		}
		return builder.toString();
	}

}
