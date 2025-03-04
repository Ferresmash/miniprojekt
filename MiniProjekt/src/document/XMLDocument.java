package document;

public class XMLDocument extends Document{

	public XMLDocument() {
		super();
	}
	
	@Override
	public String render() {
		StringBuilder builder = new StringBuilder();
		builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
				+ "<root>\r\n");
		for (DocumentElement element : elements) {
			builder.append(element.toString()).append("\n");
		}
		builder.append("</root>");
		return builder.toString();
	}

}
