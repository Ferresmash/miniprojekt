package factory;

import java.util.List;

import document.DocumentElement;
import document.TableRow;
import xml.XMLHeading;
import xml.XMLListElement;
import xml.XMLParagraph;
import xml.XMLTable;
import xml.XMLTableRow;

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
	public DocumentElement createList(List<DocumentElement> items) {
		return new XMLListElement(items);
	}

	@Override
	public DocumentElement createTable(List<TableRow> data) {
		return new XMLTable(data);
	}

	@Override
	public DocumentElement createTableRow(List<DocumentElement> row) {
		return new XMLTableRow(row);
	}

}
