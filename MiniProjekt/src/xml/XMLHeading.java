package xml;

import document.Heading;

public class XMLHeading extends Heading {
	
	public XMLHeading(String content, int level) {
		super(content, level);
	}

	@Override
	public String toString() {
		return "<heading level=\"" + getLevel() + "\">" + content + "</heading>\n";
	}

}
