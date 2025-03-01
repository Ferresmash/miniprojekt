package factory;

import java.util.List;

import document.DocumentElement;

public class XMLDocumentElementFactory implements DocumentElementFactory {

	@Override
	public DocumentElement createParagraph(String text) {
		return new XMLParagraph(text);
	}

	@Override
	public DocumentElement createHeading(String text, int level) {
		return new XMLHeading(text, level);
	}

	@Override
	public DocumentElement createList(List<String> items) {
		return new XMLList(items);
	}

	@Override
	public DocumentElement createTable(List<List<String>> data) {
		return new XMLTable(data);
	}

}
