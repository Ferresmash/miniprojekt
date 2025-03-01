package html;

import document.Paragraph;

public class HTMLParagraph extends Paragraph {

	public HTMLParagraph(String content) {
		super(content);
	}

	@Override
	public String toString() {
		return "<p>"+content+"</p>\n";
	}
	
}
