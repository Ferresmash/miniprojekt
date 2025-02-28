package command;

import document.Document;
import singleton.DocumentManager;

public class SaveDocumentCommand implements Command {
	DocumentManager manager;
	Document document;
	String id;
	
	
	public SaveDocumentCommand(DocumentManager manager, Document document, String id) {
		this.manager = manager;
		this.document = document;
		this.id = id;
	}
	@Override
	public void execute() {
		manager.saveDocument(id, document);
	}

	@Override
	public void undo() {
		manager.deleteDocument(id);
	}

}
