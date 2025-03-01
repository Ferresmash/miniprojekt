package factory;

import java.util.List;

import document.DocumentElement;
import document.Heading;
import document.ListElement;
import document.Paragraph;
import document.Table;
import document.TableRow;
import html.HTMLTable;

public class ConcreteElementFactory implements DocumentElementFactory {

	@Override
	public DocumentElement createParagraph(String text) {
		return new Paragraph(text);
	}

	@Override
	public DocumentElement createHeading(String text, int level) {
		return new Heading(text, level);
	}

    @Override
    public DocumentElement createListElement(List<DocumentElement> items) {
        ListElement list = new ListElement();
        for (DocumentElement item : items) {
            list.add(item);
        }
        return list;
    }


	@Override
	public DocumentElement createTable(List<List<DocumentElement>> data) {
		Table table = new Table();
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
