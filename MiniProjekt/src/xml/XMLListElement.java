package xml;

import document.DocumentElement;
import document.ListElement;

public class XMLListElement extends ListElement {

	
	@Override
	public String toString() {

		String str = "<list>\n";
		for(DocumentElement element : getContent()) {

			if(element.toString().startsWith("<list>")) {
				str += element.toString() + "\n";
			}else {
				str += "<item>" + element.toString() + "</item>\n";			
			}
		}
		return str+ "</list>";
	}
	
}
