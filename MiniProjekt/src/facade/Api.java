package facade;

import java.util.Stack;

import builder.Director;
import builder.DocumentBuilder;
import builder.StandardDocumentBuilder;
import command.Command;
import document.Document;
import document.DocumentElement;
import factory.ConcreteElementFactory;
import factory.DocumentElementFactory;
import iterator.ConcreteDocumentIterator;
import iterator.DocumentIterator;
import singleton.DocumentManager;
import visitor.HTMLVisitor;
import visitor.XMLVisitor;

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
		DocumentBuilder builder = new StandardDocumentBuilder(new ConcreteElementFactory());
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
	
	public Document convertToStandard() {
		
	}
	
	public Document convertToHTML() {
		
	}

	public Document convertToXML() {
		
	}

	@Override
	public String renderDocument(Document document) {
		return document.render();
	}
	
	public String renderAsHTML(Document document) {
		return document.render(new HTMLVisitor());
	}
	
	public String renderAsXML(Document document) {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n <document>\n" + document.render(new XMLVisitor()) + "</document>";
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
	public void printDocumentElements(Document document) {
		this.documentIterator = new ConcreteDocumentIterator(document);
		while (documentIterator.hasNext()) {
			System.out.println(documentIterator.next().toString());
		}
	}

}
