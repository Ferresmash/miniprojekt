package html;

import document.Paragraph;

public class HTMLParagraph extends Paragraph {

	@Override
	public String toString() {
		return "<p>"+content+"</p>\n";
	}
	
}
