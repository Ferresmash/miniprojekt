package visitor;

import java.util.List;

import document.DocumentElement;
import document.Heading;
import document.ListElement;
import document.Paragraph;
import document.Table;
import document.TableRow;

public class HTMLVisitor implements Visitor {

	@Override
	public String visit(Heading e) {
		return "<h"+e.getLevel()+">"+e.toString()+"</h"+e.getLevel()+">";
	}

	@Override
	public String visit(ListElement e) {
		String str = "<ul>\n";
		for(DocumentElement element : e.getContent()) {
			if(element.accept(this).startsWith("<ul>")) {
				str += element.accept(this)+"\n";
			} else {
				str += "<li>\n"+element.accept(this)+"</li>\n";
			}
		}
		return str+ "</ul>";
	}

	@Override
	public String visit(Paragraph e) {
		return "<p>"+e.toString()+"</p>\n";
	}

	@Override
	public String visit(Table e) {
		String str = "<table>\n";
		for(DocumentElement element : e.getRows()) {
			str += "<tr>\n"+element.accept(this)+"</tr>\n";
		}
		return str+ "</table>\n";
	}

	@Override
	public String visit(TableRow e) {
		String str = "";
		for(DocumentElement element : e.getCells()) {
			str += "<td>"+element.accept(this)+"</td>\n";
		}
		return str;
	}

}
