package visitor;

import document.Heading;
import document.ListElement;
import document.Paragraph;
import document.Table;
import document.TableRow;

public interface Visitor {
	
	public String visit(Heading documentElement);
	public String visit(ListElement documentElement);
	public String visit(Paragraph documentElement);
	public String visit(Table documentElement);
	public String visit(TableRow documentElement);

}
