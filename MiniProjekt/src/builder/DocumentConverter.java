package builder;

import java.util.HashMap;

import document.Document;
import document.DocumentElement;
import singleton.DocumentManager;

public class DocumentConverter {
	
	public static DocumentConverter instance;
	
	private DocumentConverter() {

    }

    public static DocumentConverter getInstance() {
        if (instance == null) {
            instance = new DocumentConverter();
        }
        return instance;
    }
    
	public HTMLDocument toHTML(Document document) {
		HTMLDocumet document = new HTMLDocment();
		for(DocumentElement element : document.getElements()) {
			document.add(element.accept(HTMLVisitor));
		}
	}
	
	public XMLDocument toXML(Document document) {
		for(DocumentElement element : document.getElements()) {
			element.accept(HTMLVisitor);
		}
	}
	
	public Document toStandard(Document document) {
		for(DocumentElement element : document.getElements()) {
			element.accept(HTMLVisitor);
		}
	}
}
