package builder;

import java.util.List;

import document.Document;
import document.DocumentElement;
import document.HTMLDocument;
import document.TableRow;
import factory.DocumentElementFactory;
import factory.HTMLDocumentElementFactory;

public class HTMLDocumentBuilder implements DocumentBuilder {
	
	private Document document = new HTMLDocument();
	private DocumentElementFactory factory = new HTMLDocumentElementFactory();

	
	public HTMLDocumentBuilder() {

	}

	@Override
	public void addHeading(String text, int level) {
		document.addElement(factory.createHeading(text, level));
	}

	@Override
	public void addParagraph(String text) {
		document.addElement(factory.createParagraph(text));		
	}

	@Override
	public void addList(List<DocumentElement> items) {
		document.addElement(factory.createList(items));
	}

	@Override
	public Document getResult() {
		return document;
	}

	@Override
	public void addTable(List<TableRow> items) {
	document.addElement(factory.createTable(items));
	}

	@Override
	public void addTableRow(List<DocumentElement> row) {
	document.addElement(factory.createTableRow(row));
	}

}
