package visitor;
import builder.DocumentBuilder;
import builder.HTMLDocumentBuilder;
import document.Document;
import document.Heading;
import document.ListElement;
import document.Paragraph;
import document.Table;
import document.TableRow;



public class HTMLVisitor implements Visitor {
	private DocumentBuilder dB = new HTMLDocumentBuilder();
	
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
    
    public void visit(TableRow e) {
    	dB.addTableRow(e.getContent());
    }

	@Override
	public Document getResult() {
		return dB.getResult();
	}

}
