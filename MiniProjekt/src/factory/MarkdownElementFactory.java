package factory;

import java.util.List;

import document.DocumentElement;
import document.Heading;
import document.ListElement;
import document.Paragraph;
import document.Table;
import document.TableRow;

public class MarkdownElementFactory implements DocumentElementFactory {
	
	@Override
	public DocumentElement createParagraph(String text) {
		return new Paragraph(text);
	}

	@Override
	public DocumentElement createHeading(String text, int level) {
		return new Heading(text, level);
	}

    @Override
    public DocumentElement createList(List<String> items) {
        ListElement list = new ListElement();
        for (String item : items) {
            list.add(new Paragraph(item));
        }
        return list;
    }


	@Override
	public DocumentElement createTable(List<List<String>> data) {
		Table table = new Table();
		for (List<String> list : data) {
			TableRow row = new TableRow();
			for (String string : list) {
				row.add(new Paragraph(string));
			}
			table.add(row);
		}	
		return table;
	}

}
