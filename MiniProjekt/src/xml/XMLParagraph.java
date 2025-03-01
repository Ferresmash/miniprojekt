package xml;

import document.Paragraph;

public class XMLParagraph extends Paragraph {

	public XMLParagraph(String content) {
		super(content);
	}

	@Override
	public String toString() {
		return "<paragraph>"+content+"</paragraph>\n";
	}
	
}
