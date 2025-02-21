package builder;

import java.util.List;

import document.Document;

public interface DocumentBuilder {

    void addHeading(String text, int level);


    void addParagraph(String text);


    void addList(List<String> items);


    void addTable(List<List<String>> items);


    Document getResult();
}

