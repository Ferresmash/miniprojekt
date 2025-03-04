package xml;

import java.util.List;

import document.DocumentElement;
import document.ListElement;

public class XMLListElement extends ListElement {

	
	public XMLListElement(List<DocumentElement> items) {
		super(items);
	}

	@Override
	public String toString() {
	    StringBuilder str = new StringBuilder("<list>\n");
	    
	    for (DocumentElement element : getContent()) {
	        if (element.toString().startsWith("<list>")) {
	            str.append("<item>\n").append(element.toString()).append("\n</item>\n");
	        } else {
	            str.append("<item>").append(element.toString()).append("</item>\n");
	        }
	    }
	    
	    str.append("</list>");
	    return str.toString();
	}
	
}
