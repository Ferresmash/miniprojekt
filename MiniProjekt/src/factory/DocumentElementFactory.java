package factory;

import java.util.List;

import document.DocumentElement;

public interface DocumentElementFactory {

    DocumentElement createParagraph(String text);


    DocumentElement createHeading(String text, int level);


    DocumentElement createListElement(List<DocumentElement> items);
    

    DocumentElement createTable(List<List<DocumentElement>> data);
}