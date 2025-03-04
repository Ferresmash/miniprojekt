package html;

import document.Paragraph;

public class HTMLParagraph extends Paragraph {

	public HTMLParagraph(String text) {
		super(text);
	}

	@Override
	public String toString() {
		return "<p>"+content+"</p>\n";
	}
	
}
