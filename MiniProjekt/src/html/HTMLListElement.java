package html;

import document.DocumentElement;
import document.ListElement;

public class HTMLListElement extends ListElement {

	@Override
	public String toString() {

		String str = "<ul>\n";
		for(DocumentElement element : getContent()) {

			if(element.toString().startsWith("<ul>")) {
				str += element.toString() + "\n";
			}else {
				str += "<li>" + element.toString() + "</li>\n";

			}
		}
		return str+ "</ul>";
	}
	
}