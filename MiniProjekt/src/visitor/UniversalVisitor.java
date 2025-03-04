package visitor;
import java.util.ArrayList;
import java.util.List;

import document.DocumentElement;
import document.Heading;
import document.ListElement;
import document.Paragraph;
import document.Table;
import document.TableRow;
import factory.DocumentElementFactory;



public class UniversalVisitor implements Visitor {
	private DocumentElementFactory factory;	
	
	public UniversalVisitor(DocumentElementFactory factory) {
        this.factory = factory;
    }
	
	@Override
    public DocumentElement visit(Heading e) {
        return factory.createHeading(e.getContent(), e.getLevel());
    }

    @Override
    public DocumentElement visit(ListElement e) {
        List<DocumentElement> convertedItems = new ArrayList<>();
        for (DocumentElement item : e.getContent()) {
            DocumentElement convertedItem = item.accept(this);
            convertedItems.add(convertedItem);
        }
        return factory.createList(convertedItems);
    }

    @Override
    public DocumentElement visit(Paragraph e) {
        return factory.createParagraph(e.getContent());
    }

    @Override
    public DocumentElement visit(Table e) {
        List<TableRow> convertedRows = new ArrayList<>();
        for (TableRow row : e.getContent()) {
            TableRow convertedRow = (TableRow) row.accept(this);
            convertedRows.add(convertedRow);
        }
        return factory.createTable(convertedRows);
    }

    @Override
    public DocumentElement visit(TableRow e) {
        List<DocumentElement> convertedCells = new ArrayList<>();
        for (DocumentElement cell : e.getContent()) {
            DocumentElement convertedCell = cell.accept(this);
            convertedCells.add(convertedCell);
        }
        return factory.createTableRow(convertedCells);
    }

}
