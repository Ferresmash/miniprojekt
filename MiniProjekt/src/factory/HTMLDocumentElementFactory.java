package factory;

import java.util.List;
import document.DocumentElement;
import document.TableRow;
import html.*;

public class HTMLDocumentElementFactory implements DocumentElementFactory {

	@Override
	public DocumentElement createParagraph(String text) {
		return new HTMLParagraph(text);
	}

	@Override
	public DocumentElement createHeading(String text, int level) {
		return new HTMLHeading(text, level);
	}

	@Override
	public DocumentElement createList(List<DocumentElement> items) {
		return new HTMLListElement(items);
	}

	@Override
	public DocumentElement createTable(List<TableRow> data) {
		return new HTMLTable(data);
	}

	@Override
	public DocumentElement createTableRow(List<DocumentElement> row) {
		return new HTMLTableRow(row);
	}

}
