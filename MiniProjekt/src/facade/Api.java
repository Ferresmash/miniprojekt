package facade;

import java.util.Stack;

import builder.Director;
import builder.DocumentBuilder;
import builder.StandardDocumentBuilder;
import command.Command;
import document.Document;
import document.DocumentElement;
import iterator.ConcreteDocumentIterator;
import iterator.DocumentIterator;
import singleton.DocumentManager;
import visitor.HTMLVisitor;
import visitor.LaTeXVisitor;

public class Api implements Facade {

	private DocumentManager documentManager;
	private Director director;
	private DocumentIterator documentIterator;
	private Stack<Command> undoStack = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();
	

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
	
	public void executeCommand(Command command) {
		command.execute();
		undoStack.push(command);
        redoStack.clear();
	}
	
	public void undo() {
		if (!undoStack.isEmpty()) {
            Command command = undoStack.pop();
            command.undo();
            redoStack.push(command);
        }
	}
	
	public void redo() {
		if (!redoStack.isEmpty()) {
            Command command = redoStack.pop();
            command.execute();
            undoStack.push(command);
        }
	}

	@Override
	public void addElement(Document document, DocumentElement element) {
		document.addElement(element);
	}

	@Override
	public String renderDocument(Document document) {
		return document.render();
	}
	
	public String renderAsHTML(Document document) {
		return document.render(new HTMLVisitor());
	}
	
	public String renderAsLaTeX(Document document) {
		return document.render(new LaTeXVisitor());
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
			System.out.println(documentIterator.next().toString());
		}
	}

}
