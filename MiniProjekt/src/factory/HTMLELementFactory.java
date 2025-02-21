package factory;

import java.util.List;

import document.DocumentElement;
import document.Heading;
import document.ListElement;
import document.Paragraph;
import document.Table;
import document.TableRow;

public class HTMLELementFactory implements DocumentElementFactory {
	
	@Override
	public DocumentElement createParagraph(String text) {
		return new Paragraph("<p>"+text+"<p>");
	}

	@Override
	public DocumentElement createHeading(String text, int level) {
		return new Heading("<h"+level+">"+text+"<h"+level+">", level);
	}

    @Override
    public DocumentElement createList(List<String> items) {
        ListElement list = new ListElement();
        for (String item : items) {
            list.add(new Paragraph("<li>"+item+"<li>"));
        }
        return list;
    }


	@Override
	public DocumentElement createTable(List<List<String>> data) {
		
		Table table = new Table();
		for (List<String> list : data) {
			TableRow row = new TableRow();
			
			for (String string : list) {
				row.add(new Paragraph("<td>"+string+"<td>"));
			}
			
			table.add(row);
		}	
		return table;
	}

}
