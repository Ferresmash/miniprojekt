package document;


public class HTMLDocument extends Document { 
	
	public HTMLDocument() {
		super();
	}

	@Override
	public String render() {
		StringBuilder builder = new StringBuilder();
		builder.append("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "  <head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>HTML 5 Boilerplate</title>\r\n"
				+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
				+ "  </head>\r\n"
				+ "  <body>");
		for (DocumentElement element : elements) {
			builder.append(element.toString()).append("\n");
		}
		builder.append("</body>\r\n"
				+ "</html>");
		return builder.toString();
	}

}
