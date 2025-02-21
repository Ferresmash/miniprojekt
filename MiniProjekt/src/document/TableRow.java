package document;

import java.util.ArrayList;
import java.util.List;

public class TableRow implements DocumentElement, CompositeElement {

	private List<DocumentElement> cells = new ArrayList<>();

    public TableRow() {
    }

    public TableRow(List<DocumentElement> cells) {
        this.cells = cells;
    }

    @Override
    public void add(DocumentElement element) {
        cells.add(element);
    }

    @Override
    public void remove(DocumentElement element) {
        cells.remove(element);
    }

    @Override
    public DocumentElement getChild(int index) {
        return cells.get(index);
    }

    @Override
    public String render() {
        StringBuilder sb = new StringBuilder();
        for (DocumentElement cell : cells) {
            sb.append(cell.render()).append(" | ");
        }
        if(sb.length() > 0) {
            sb.setLength(sb.length() - 3);
        }
        return sb.toString();
    }
    
    public List<DocumentElement> getCells() {
        return cells;
    }

}
