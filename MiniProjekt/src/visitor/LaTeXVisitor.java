package visitor;

import document.DocumentElement;
import document.Heading;
import document.ListElement;
import document.Paragraph;
import document.Table;
import document.TableRow;

public class LaTeXVisitor implements Visitor {

	@Override
	public String visit(Heading e) {
		return "begin{\\huge}" + e.toString() + "end{\\huge}";
	}

	@Override
	public String visit(ListElement e) {
		String str = "\\begin{itemsize}\n";
		for(DocumentElement element : e.getContent()) {
			if(element.accept(this).startsWith("<ul>")) {
				str += element.accept(this)+"\n";
			} else {
				str += "\\item"+element.accept(this)+"\n";
			}
		}
		return str+ "\\end{itemize}";
	}

	@Override
	public String visit(Paragraph e) {
		return e.toString();
	}
	@Override
	public String visit(Table e) {
		return "";
	}

	@Override
	public String visit(TableRow e) {
		return "";
	}

}
