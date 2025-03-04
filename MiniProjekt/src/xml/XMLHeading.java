package xml;

import document.Heading;

public class XMLHeading extends Heading {

	public XMLHeading(String text, int level) {
		super(text,level);
	}

	@Override
	public String toString() {
		return "<heading level=\"" + getLevel() + "\">" + content + "</heading>\n";
	}
	
}
