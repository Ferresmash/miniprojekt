package builder;

import java.util.List;

public class Director {
    private DocumentBuilder builder;

    public Director(DocumentBuilder builder) {
        this.builder = builder;
    }

    public void constructDocument() {
        builder.addHeading("Välkommen", 1);
        builder.addParagraph("Detta är en introduktion till dokumentet.");
        builder.addHeading("Avsnitt 1", 2);
        builder.addParagraph("Lista: ");
        builder.addList(List.of("Punkt 1", "Punkt 2", "Punkt 3"));
        builder.addParagraph("Tabell: ");
        builder.addTable(List.of(List.of("1,1","1,2","1,3"), List.of("2,1","2,2","2,3"), List.of("3,1","3,2","3,3")));

    }
    
    
    
}
