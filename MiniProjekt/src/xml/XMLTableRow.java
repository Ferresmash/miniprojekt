package xml;

import java.util.List;

import document.DocumentElement;
import document.TableRow;

public class XMLTableRow extends TableRow{
	
	public XMLTableRow(List<DocumentElement> row) {
		super(row);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		String str = "<row>\n";
        for(DocumentElement element : getContent()) {
            str += "<cell>" + element.toString() + "</cell>\n";
        }
        return str + "</row>\n";
	}
}
