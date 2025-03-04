package builder;

import java.util.List;

import document.Document;
import document.DocumentElement;
import document.TableRow;

public interface DocumentBuilder {

    void addHeading(String text, int level);

    void addParagraph(String text);


    void addList(List<DocumentElement> items);


    void addTable(List<TableRow> items);

    void addTableRow(List<DocumentElement> row);

    Document getResult();
}

