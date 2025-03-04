package factory;

import java.util.List;

import document.DocumentElement;
import document.TableRow;

public interface DocumentElementFactory {

    DocumentElement createParagraph(String text);


    DocumentElement createHeading(String text, int level);


    DocumentElement createList(List<DocumentElement> items);


    DocumentElement createTable(List<TableRow> data);
    
    DocumentElement createTableRow(List<DocumentElement> row);
}