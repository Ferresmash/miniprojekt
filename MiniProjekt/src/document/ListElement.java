package document;

import java.util.ArrayList;
import java.util.List;

import visitor.Visitor;

public class ListElement implements DocumentElement, CompositeElement {

	private List<DocumentElement> elementList = new ArrayList<DocumentElement>();

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

	@Override
	public String render() {
		String output = "";
		for (DocumentElement documentElement : elementList) {
			output += " - " + documentElement.render() + "\n";
		}
		return output;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}

}
