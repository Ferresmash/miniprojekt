package xml;

import document.Paragraph;

public class XMLParagraph extends Paragraph {

	
	@Override
	public String toString() {
		return "<paragraph>"+content+"</paragraph>\n";
	}
	
}
