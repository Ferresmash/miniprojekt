package document;

import visitor.Visitor;

public class Heading implements DocumentElement {
	
	protected String content;
	private int level;
	
	public Heading() {
		this("", 1);
	}
	
	public Heading(String content, int level) {
		this.setContent(content);
		this.setLevel(level);
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return content;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public String getContent() {
		return content;
	}

	@Override
	public DocumentElement accept(Visitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public boolean hasChild() {
		return false;
	}
}
