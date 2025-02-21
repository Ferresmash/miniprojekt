package builder;

import java.util.List;

import document.Document;
import factory.ConcreteElementFactory;
import factory.DocumentElementFactory;

public class MarkDownDocumentBuilder implements DocumentBuilder {

	private Document document;
	private DocumentElementFactory factory;
	
	public MarkDownDocumentBuilder() {
		this.document = new Document();
		this.factory = new ConcreteElementFactory();
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
	public void addList(List<String> items) {
		document.addElement(factory.createList(items));
	}

	@Override
	public Document getResult() {
		return document;
	}

	@Override
	public void addTable(List<List<String>> items) {
	document.addElement(factory.createTable(items));
	}
	
}
