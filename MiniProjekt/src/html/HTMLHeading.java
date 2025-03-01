package html;

import document.Heading;

public class HTMLHeading extends Heading{

	@Override
	public String toString() {
		return "<h"+getLevel()+">"+content+"</h"+getLevel()+">";
	}
}
