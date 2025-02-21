package facade;

import builder.Director;
import builder.DocumentBuilder;
import builder.StandardDocumentBuilder;
import document.Document;
import document.DocumentElement;
import iterator.ConcreteDocumentIterator;
import iterator.DocumentIterator;
import singleton.DocumentManager;

public class Api implements Facade {

	private DocumentManager documentManager;
	private Director director;
	private DocumentIterator documentIterator;

	public Api() {
		this.documentManager = DocumentManager.getInstance();
	}

	@Override
	public Document createDocument() {
		DocumentBuilder builder = new StandardDocumentBuilder();
		director = new Director(builder);
		director.constructDocument();
		return builder.getResult();
	}

	@Override
	public void addElement(Document document, DocumentElement element) {
		document.addElement(element);
	}

	@Override
	public String renderDocument(Document document) {
		return document.render();
	}

	@Override
	public Document getDocument(String id) {
		if (documentManager.documentExists(id)) {
			return documentManager.getDocument(id);
		} else {
			throw new IllegalArgumentException("Dokument med detta id finns ej!");
		}
	}

	@Override
	public void saveDocument(String id, Document document) {
		documentManager.saveDocument(id, document);

	}

	@Override
	public void deleteDocument(String id) {
		if (documentManager.documentExists(id)) {
			documentManager.deleteDocument(id);
		} else {
			throw new IllegalArgumentException("Dokument med detta id finns ej!");
		}
	}

	@Override
	public void printDocumentElements(Document document) {
		this.documentIterator = new ConcreteDocumentIterator(document);
		while (documentIterator.hasNext()) {
			System.out.println(documentIterator.next().render());
		}
	}

}
