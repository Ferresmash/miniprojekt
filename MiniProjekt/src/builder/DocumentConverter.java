package builder;

import document.Document;

import document.DocumentElement;
import document.HTMLDocument;
import document.StandardDocument;
import document.XMLDocument;
import factory.ConcreteElementFactory;
import factory.HTMLDocumentElementFactory;
import factory.XMLDocumentElementFactory;
import visitor.UniversalVisitor;
import visitor.Visitor;

public class DocumentConverter {
	
	public Document toHTML(Document document) {
		Visitor visitor = new UniversalVisitor(new HTMLDocumentElementFactory());
        Document newDoc = new HTMLDocument();
        for (DocumentElement element : document.getElements()) {
            DocumentElement convertedElement = element.accept(visitor);
            newDoc.addElement(convertedElement);
        }
        return newDoc;
	}
	public Document toXML(Document document) {
		Visitor visitor = new UniversalVisitor(new XMLDocumentElementFactory());
        Document newDoc = new XMLDocument();
        for (DocumentElement element : document.getElements()) {
            DocumentElement convertedElement = element.accept(visitor);
            newDoc.addElement(convertedElement);
        }
        return newDoc;
	}
	public Document toStandard(Document document) {
		Visitor visitor = new UniversalVisitor(new ConcreteElementFactory());
        Document newDoc = new StandardDocument();
        for (DocumentElement element : document.getElements()) {
            DocumentElement convertedElement = element.accept(visitor);
            newDoc.addElement(convertedElement);
        }
        return newDoc;
	}
}
