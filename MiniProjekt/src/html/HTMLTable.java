package html;

import java.util.List;

import document.DocumentElement;
import document.Table;
import document.TableRow;

public class HTMLTable extends Table{
	
	public HTMLTable(List<TableRow> data) {
		super(data);
	}

	@Override
	public String toString() {
		String str = "<table>\n";
		for(TableRow row : getContent()) {
			str += "<tr>";
			for(DocumentElement element : row.getContent()) {
				str += "<td>"+element.toString() + "</td>\n";
			}
			str += "<tr>\n";
		}
		return str+ "</table>\n";
	}
	
}
