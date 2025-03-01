package xml;

import java.util.List;

import document.DocumentElement;
import document.TableRow;

public class XMLTableRow extends TableRow{
	
	public XMLTableRow(List<DocumentElement> cells) {
		super(cells);
	}

	@Override
	public String toString() {
		String str = "<row>\n";
        for(DocumentElement element : getCells()) {
            str += "<cell>" + element.toString() + "</cell>\n";
        }
        return str + "</row>\n";
	}
	
}
