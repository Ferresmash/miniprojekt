package document;

import java.util.ArrayList;
import java.util.List;

import visitor.Visitor;

public class ListElement implements DocumentElement, CompositeElement {

	protected List<DocumentElement> elementList = new ArrayList<DocumentElement>();

	public ListElement() {

	}

	public ListElement(List<DocumentElement> elementList) {
		this.elementList = elementList;
	}

	@Override
	public void add(DocumentElement element) {
		elementList.add(element);
	}

	@Override
	public void remove(DocumentElement element) {
		elementList.remove(element);
	}

	@Override
	public DocumentElement getChild(int index) {
		return elementList.get(index);
	}
	
	
	
	public List<DocumentElement> getContent() {
		return elementList;
	}

	@Override
	public String toString() {
		String output = "";
		for (DocumentElement documentElement : elementList) {
			output += documentElement.toString() + "\n";
		}
		return output;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public boolean hasChild() {
		if(getContent().size() > 1) {
			return true;
		}
		return false;
	}
}
