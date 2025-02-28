package command;

import document.Document;
import document.DocumentElement;

public class RemoveElementCommand implements Command{
	Document document;
	DocumentElement element;
	int index;
	
	public RemoveElementCommand(Document document, int index) {
		this.document = document;
		this.index = index;
	}
	@Override
	public void execute() {
		this.element = document.removeElement(index);

	}

	@Override
	public void undo() {
		document.addElement(element);
	}
}
