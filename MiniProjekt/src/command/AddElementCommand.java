package command;

import document.Document;
import document.DocumentElement;

public class AddElementCommand implements Command{
	Document document;
	DocumentElement element;
	int index;
	
	public AddElementCommand(Document document, DocumentElement element) {
		this.document = document;
		this.element = element;
	}
	@Override
	public void execute() {
		document.addElement(element);
		index = document.getElements().size()-1;
	}

	@Override
	public void undo() {
		document.removeElement(index);
	}

}
