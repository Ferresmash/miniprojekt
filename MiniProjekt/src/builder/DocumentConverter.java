package builder;

import document.Document;
import document.DocumentElement;

public class DocumentConverter {
	public HTMLDocument toHTML(Document document) {
		for(DocumentElement element : document.getElements()) {
			element.accept(HTMLVisitor);
		}
	}
}
