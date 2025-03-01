package visitor;

import java.util.List;

import document.DocumentElement;
import document.Heading;
import document.ListElement;
import document.Paragraph;
import document.Table;
import document.TableRow;
import factory.HTMLDocumentElementFactory;

public class HTMLVisitor implements Visitor {
	HTMLDocumentElementFactory factory = new HTMLDocumentElementFactory();
	
	@Override
	public DocumentElement visit(Heading e) {
		return factory.createHeading(e.getContent(), e.getLevel());
	}

	@Override
	public DocumentElement visit(ListElement e) {
		return factory.createListElement(e.getContent());
	}

	@Override
	public DocumentElement visit(Paragraph e) {
		return factory.createParagraph(e.getContent());
	}

	@Override
	public DocumentElement visit(Table e) {
		return factory.createTable(e.getContent());
	}

	@Override
	public DocumentElement visit(TableRow e) {
		return factory.createTableRow(e.getContent(), e.getLevel());
	}

}
