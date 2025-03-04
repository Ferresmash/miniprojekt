package builder;

import document.Document;
import document.DocumentElement;
import visitor.HTMLVisitor;
import visitor.StandardVisitor;
import visitor.XMLVisitor;
import visitor.Visitor;

public class DocumentConverter {
	
	public Document toHTML(Document document) {
		Visitor visitor = new HTMLVisitor();
		for(DocumentElement element : document.getElements()) {
			element.accept(visitor);
		}
		return visitor.getResult();
	}
	public Document toXML(Document document) {
		Visitor visitor = new XMLVisitor();
		for(DocumentElement element : document.getElements()) {
			element.accept(visitor);
		}
		return visitor.getResult();
	}
	public Document toStandard(Document document) {
		Visitor visitor = new StandardVisitor();
		for(DocumentElement element : document.getElements()) {
			element.accept(visitor);
		}
		return visitor.getResult();
	}
}
