package document;

import visitor.Visitor;

public class Heading implements DocumentElement {
	
	private String content;
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

	@Override
	public String accept(Visitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
}
