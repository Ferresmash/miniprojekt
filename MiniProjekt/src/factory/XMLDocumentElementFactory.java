package factory;

import java.util.List;

import document.DocumentElement;
import document.TableRow;
import xml.XMLHeading;
import xml.XMLListElement;
import xml.XMLParagraph;
import xml.XMLTable;

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
	public DocumentElement createListElement(List<DocumentElement> items) {
		 XMLListElement list = new XMLListElement();
        for (DocumentElement item : items) {
            list.add(item);
        }
        return list;
	}

	@Override
	public DocumentElement createTable(List<List<DocumentElement>> data) {
		XMLTable table = new XMLTable();
		for (List<DocumentElement> list : data) {
			TableRow row = new TableRow();
			for (DocumentElement e : list) {
				row.add(e);
			}
			table.add(row);
		}	
		return table;
	}

}
