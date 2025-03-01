package document;

import visitor.Visitor;

public class Paragraph implements DocumentElement {

	protected String content;
	
	public Paragraph() {
		this("");
	}
	
	public Paragraph(String content) {
		this.setContent(content);
	}
	
	@Override
	public String toString() {
		return content;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visit(this);
	}
}
