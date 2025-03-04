package xml;

import document.Paragraph;

public class XMLParagraph extends Paragraph {

	
	public XMLParagraph(String text) {
		super(text);
	}

	@Override
	public String toString() {
		return "<paragraph>"+content+"</paragraph>\n";
	}
	
}
