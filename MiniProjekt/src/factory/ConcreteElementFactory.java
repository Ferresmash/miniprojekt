package factory;

import java.util.List;

import document.DocumentElement;
import document.Heading;
import document.ListElement;
import document.Paragraph;
import document.Table;
import document.TableRow;

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
    public DocumentElement createList(List<DocumentElement> items) {
        ListElement list = new ListElement();
        for (DocumentElement item : items) {
            list.add(item);
        }
        return list;
    }

	@Override
	public DocumentElement createTable(List<TableRow> data) {
		Table table = new Table();
		for (TableRow list : data) {
			table.add(list);
		}	
		return table;
	}

	@Override
	public DocumentElement createTableRow(List<DocumentElement> row) {
		TableRow list = new TableRow();
        for (DocumentElement item : row) {
            list.add(item);
        }
        return list;
	}

}
