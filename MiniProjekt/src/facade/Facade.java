package facade;

import document.Document;
import document.DocumentElement;

public interface Facade {
	
	    public Document createDocument();
	    
	    public void addElement(Document document, DocumentElement element);
	    
	    public String renderDocument(Document document);
	    
	    public String renderAsHTML(Document document);
	    
	    public String renderAsLaTeX(Document document);
	    
	    public Document getDocument(String id);
	    
	    public void saveDocument(String id, Document document);
	    
	    public void deleteDocument(String id);
	    
	    public void printDocumentElements(Document document);
	    
}

