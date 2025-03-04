package facade;

import command.Command;
import document.Document;
import document.DocumentElement;

public interface Facade {
	
	    public Document createDocument();
	    
	    public void executeCommand(Command command);
	    
	    public void undo();
	    
	    public void redo();
	    
	    public String renderDocument(Document document);
	    
	    public Document convertToHTML(Document document);
	    
	    public Document convertToXML(Document document);
	    
	    public Document convertToStandard(Document document);
	    
	    public Document getDocument(String id);
	    
	    public void printDocumentElements(Document document);
	    
}

