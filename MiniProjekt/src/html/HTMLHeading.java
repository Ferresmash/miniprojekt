package html;

import document.Heading;

public class HTMLHeading extends Heading{

	public HTMLHeading(String text, int level) {
		super(text,level);
	}

	@Override
	public String toString() {
		return "<h"+getLevel()+">"+content+"</h"+getLevel()+">";
	}
}
