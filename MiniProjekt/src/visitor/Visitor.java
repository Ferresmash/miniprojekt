package visitor;

import document.DocumentElement;
import document.Heading;
import document.ListElement;
import document.Paragraph;
import document.Table;
import document.TableRow;

public interface Visitor {
	
	public DocumentElement visit(Heading documentElement);
	public DocumentElement visit(ListElement documentElement);
	public DocumentElement visit(Paragraph documentElement);
	public DocumentElement visit(Table documentElement);
	public DocumentElement visit(TableRow documentElement);

}
