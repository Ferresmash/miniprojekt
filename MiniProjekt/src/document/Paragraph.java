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

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String getContent() {
		return content;
	}

	@Override
	public boolean hasChild() {
		return false;
	}
}
