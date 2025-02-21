package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import document.Document;
import document.DocumentElement;
import document.Heading;
import document.Paragraph;

public class DocumentTest {

    /**
     * Testar att element läggs till korrekt och att getElement returnerar rätt element.
     */
    @Test
    public void testAddAndGetElement() {
        Document doc = new Document();
        DocumentElement e1 = new Heading("Element 1", 3);
        DocumentElement e2 = new Paragraph("Element 2");

        doc.addElement(e1);
        doc.addElement(e2);

        List<DocumentElement> elements = doc.getElements();
        assertEquals(2, elements.size(), "Document should contain 2 elements.");
        assertEquals(e1, doc.getElement(0), "First element should be e1.");
        assertEquals(e2, doc.getElement(1), "Second element should be e2.");
    }


    @Test
    public void testGetElementInvalidIndex() {
        Document doc = new Document();
        DocumentElement e1 = new Heading("Element 1", 3);
        doc.addElement(e1);

        // Testar negativt index
        assertThrows(IndexOutOfBoundsException.class, () -> doc.getElement(-1),
                "getElement(-1) should throw IndexOutOfBoundsException.");

        // Testar index utanför listans gränser
        assertThrows(IndexOutOfBoundsException.class, () -> doc.getElement(1),
                "getElement(1) should throw IndexOutOfBoundsException.");
    }


    @Test
    public void testAddNullElement() {
        Document doc = new Document();
        doc.addElement(null);
        assertTrue(doc.getElements().isEmpty(), "Document should remain empty when null is added.");
    }


    @Test
    public void testRender() {
        Document doc = new Document();
        DocumentElement e1 = new Heading("Element 1", 3);
        DocumentElement e2 = new Paragraph("Element 2");

        doc.addElement(e1);
        doc.addElement(e2);

        String expected = "Element 1\nElement 2\n";
        assertEquals(expected, doc.render(), "Rendered document does not match expected output.");
    }
}
