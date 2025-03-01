package factory;

import java.util.List;

import document.DocumentElement;

public class HTMLDocumentElementFactory implements DocumentElementFactory {

	@Override
	public DocumentElement createParagraph(String text) {
		return new HTMLParagraph(text);
	}

	@Override
	public DocumentElement createHeading(String text, int level) {
		return new HTMLHeading(text, level);
	}

	@Override
	public DocumentElement createList(List<String> items) {
		return new HTMLList(items);
	}

	@Override
	public DocumentElement createTable(List<List<String>> data) {
		return new HTMLTable(data);
	}

}
