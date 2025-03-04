package facade;

import java.util.Stack;

import builder.Director;
import builder.DocumentBuilder;
import builder.DocumentConverter;
import builder.StandardDocumentBuilder;
import command.Command;
import document.Document;
import iterator.ConcreteDocumentIterator;
import iterator.DocumentIterator;
import singleton.DocumentManager;


public class Api implements Facade {

	private DocumentManager documentManager;
	private Director director;
	private DocumentIterator documentIterator;
	private Stack<Command> undoStack = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();
	private DocumentConverter converter = new DocumentConverter();

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
	
	public Document convertToStandard(Document doc) {
		return converter.toStandard(doc);
	}
	
	public Document convertToHTML(Document doc) {
		return converter.toHTML(doc);
	}

	public Document convertToXML(Document doc) {
		return converter.toXML(doc);
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
	public void printDocumentElements(Document document) {
		this.documentIterator = new ConcreteDocumentIterator(document);
		while (documentIterator.hasNext()) {
			System.out.println(documentIterator.next().toString());
		}
	}

}
