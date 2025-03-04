package visitor;

import builder.StandardDocumentBuilder;
import builder.DocumentBuilder;
import document.Document;
import document.Heading;
import document.ListElement;
import document.Paragraph;
import document.Table;
import document.TableRow;
import factory.XMLDocumentElementFactory;

public class XMLVisitor implements Visitor {

	private DocumentBuilder dB = new StandardDocumentBuilder(new XMLDocumentElementFactory());
	
    @Override
    public void visit(Heading e) {
        dB.addHeading(e.toString(), e.getLevel());
    }
    
    @Override
    public void visit(ListElement e) {
        dB.addList(e.getContent());
    }
    
    @Override
    public void visit(Paragraph e) {
    	dB.addParagraph(e.getContent());
    }
    
    @Override
    public void visit(Table e) {
        dB.addTable(e.getContent());
    }

	@Override
	public Document getResult() {
		return dB.getResult();
	}

	@Override
	public void visit(TableRow e) {

		dB.addTableRow(e.getContent());
	}
}