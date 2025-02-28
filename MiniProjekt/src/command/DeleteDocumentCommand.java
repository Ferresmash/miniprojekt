package command;

import document.Document;
import singleton.DocumentManager;

public class DeleteDocumentCommand implements Command{
	DocumentManager manager;
	Document document;
	String id;
	
	
	public DeleteDocumentCommand(DocumentManager manager, String id) {
		this.manager = manager;
		this.id = id;
		
		
	}
	@Override
	public void execute() {
		this.document = manager.getDocument(id);
		manager.deleteDocument(id);
	}

	@Override
	public void undo() {
		manager.saveDocument(id, document);
	}

}
