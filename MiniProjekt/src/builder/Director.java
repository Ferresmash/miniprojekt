package builder;

import java.util.List;

import document.Paragraph;
import document.TableRow;

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
        builder.addList(List.of(new Paragraph("Punkt 1"), new Paragraph("Punkt 2"), new Paragraph("Punkt 3")));
        builder.addParagraph("Tabell: ");
        builder.addTable(List.of(new TableRow(List.of(new Paragraph("1,1"),new Paragraph("1,2"),new Paragraph("1,3"))), new TableRow(List.of(new Paragraph("2,1"),new Paragraph("2,2"),new Paragraph("2,3"))), new TableRow(List.of(new Paragraph("3,1"),new Paragraph("3,2"),new Paragraph("3,3")))));
    }
}
