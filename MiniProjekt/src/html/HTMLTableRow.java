package html;

import java.util.List;

import document.DocumentElement;
import document.TableRow;

public class HTMLTableRow extends TableRow {
	
	public HTMLTableRow(List<DocumentElement> cells) {
		super(cells);
	}

	@Override
	public String toString() {
		String str = "";
		for(DocumentElement element : getCells()) {
			str += "<td>"+element.toString()+"</td>\n";
		}
		return str;
	}
	
}
