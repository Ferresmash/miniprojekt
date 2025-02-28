package facade;

import command.Command;
import document.Document;
import document.DocumentElement;

public interface Facade {
	
	    public Document createDocument();
	    
	    public void executeCommand(Command command);
	    
	    public void addElement(Document document, DocumentElement element);
	    
	    public void undo();
	    
	    public void redo();
	    
	    public String renderDocument(Document document);
	    
	    public String renderAsHTML(Document document);
	    
	    public String renderAsXML(Document document);
	    
	    public Document getDocument(String id);
	    
	    public void saveDocument(String id, Document document);
	    
	    public void deleteDocument(String id);
	    
	    public void printDocumentElements(Document document);
	    
}

