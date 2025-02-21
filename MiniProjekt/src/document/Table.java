package document;

import java.util.ArrayList;
import java.util.List;

public class Table implements DocumentElement, CompositeElement {

    private List<TableRow> rows = new ArrayList<>();

    public Table() {
    }

    public Table(List<TableRow> rows) {
        this.rows = rows;
    }

    @Override
    public void add(DocumentElement element) {
        if (element instanceof TableRow) {
            rows.add((TableRow) element);
        } else {
            throw new IllegalArgumentException("Endast TableRow-objekt kan läggas till i en Table.");
        }
    }

    @Override
    public void remove(DocumentElement element) {
        rows.remove(element);
    }

    @Override
    public DocumentElement getChild(int index) {
        return rows.get(index);
    }

    @Override
    public String render() {
        StringBuilder sb = new StringBuilder();
        for (TableRow row : rows) {
            sb.append(row.render()).append("\n");
        }
        return sb.toString();
    }
    
    //Om man skulle använda ett GUI
    public List<TableRow> getRows() {
        return rows;
    }
}
