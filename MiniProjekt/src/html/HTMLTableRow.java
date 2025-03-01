package html;

import document.DocumentElement;
import document.TableRow;

public class HTMLTableRow extends TableRow {

	@Override
	public String toString() {
		String str = "";
		for(DocumentElement element : getCells()) {
			str += "<td>"+element.toString()+"</td>\n";
		}
		return str;
	}
	
}
