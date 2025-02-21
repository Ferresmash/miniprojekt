package visitor;

import document.Heading;
import document.ListElement;
import document.Paragraph;
import document.Table;
import document.TableRow;

public interface Visitor {
	
	public void visit(Heading documentElement);
	public void visit(ListElement documentElement);
	public void visit(Paragraph documentElement);
	public void visit(Table documentElement);
	public void visit(TableRow documentElement);

}
