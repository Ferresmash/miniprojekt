package document;

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
}
