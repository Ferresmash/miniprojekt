package document;

import visitor.Visitor;

public class Paragraph implements DocumentElement {

	private String content;
	
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
	public String accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
}
