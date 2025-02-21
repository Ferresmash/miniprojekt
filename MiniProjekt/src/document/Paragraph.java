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
	public String render() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}
}
