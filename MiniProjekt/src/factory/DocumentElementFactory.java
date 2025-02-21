package factory;

import java.util.List;

import document.DocumentElement;

public interface DocumentElementFactory {

    DocumentElement createParagraph(String text);


    DocumentElement createHeading(String text, int level);


    DocumentElement createList(List<String> items);


    DocumentElement createTable(List<List<String>> data);
}