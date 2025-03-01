package xml;

import java.util.List;

import document.DocumentElement;
import document.Table;
import document.TableRow;

public class XMLTable extends Table {
	
	public XMLTable() {
		super();
	}
	
	public XMLTable(List<TableRow> rows) {
		super(rows);
	}

	@Override
	public String toString() {
		String str = "<table>\n";
		for(TableRow row : getRows()) {
			str += "<tr>";
			for(DocumentElement element : row.getCells()) {
				str += "<td>"+ element.toString() + "</td>\n";
			}
			str += "<tr>\n";
		}
		return str+ "</table>\n";
	}
}
