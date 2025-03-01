package xml;

import document.Heading;

public class XMLHeading extends Heading {

	@Override
	public String toString() {
		return "<heading level=\"" + getLevel() + "\">" + content + "</heading>\n";
	}
	
}
