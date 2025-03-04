package document;

public class StandardDocument extends Document{
	
	public StandardDocument() {
		super();
	}

	public String render() {
		StringBuilder builder = new StringBuilder();
		for (DocumentElement element : elements) {
			builder.append(element.toString()).append("\n");
		}
		return builder.toString();
	}

}
