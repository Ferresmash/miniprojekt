package factory;

import java.util.List;

import document.DocumentElement;
import document.TableRow;
import html.HTMLHeading;
import html.HTMLListElement;
import html.HTMLParagraph;
import html.HTMLTable;


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
	public DocumentElement createListElement(List<DocumentElement> items) {
		 HTMLListElement list = new HTMLListElement();
        for (DocumentElement item : items) {
            list.add(item);
        }
        return list;
	}

	@Override
	public DocumentElement createTable(List<List<DocumentElement>> data) {
		HTMLTable table = new HTMLTable();
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
