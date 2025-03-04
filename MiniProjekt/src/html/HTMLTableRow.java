package html;

import java.util.List;

import document.DocumentElement;
import document.TableRow;

public class HTMLTableRow extends TableRow {

	public HTMLTableRow(List<DocumentElement> row) {
		super(row);
	}
	
	@Override
	public String toString() {
		String str = "";
		for(DocumentElement element : getContent()) {
			str += "<td>"+element.toString()+"</td>\n";
		}
		return str;
	}
	
}
