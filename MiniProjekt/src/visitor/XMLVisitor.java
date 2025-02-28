package visitor;

import document.DocumentElement;
import document.Heading;
import document.ListElement;
import document.Paragraph;
import document.Table;
import document.TableRow;

public class XMLVisitor implements Visitor {

    @Override
    public String visit(Heading e) {
        return "<heading level=\"" + e.getLevel() + "\">" + e.toString() + "</heading>\n";
    }
    
    @Override
    public String visit(ListElement e) {
        String str = "<list>\n";
        for(DocumentElement element : e.getContent()) {
            if(element.accept(this).trim().startsWith("<list>")) {
                str += element.accept(this);
            } else {
                str += "<item>\n" + element.accept(this) + "</item>\n";
            }
        }
        return str + "</list>\n";
    }
    
    @Override
    public String visit(Paragraph e) {
        return "<paragraph>" + e.toString() + "</paragraph>\n";
    }
    
    @Override
    public String visit(Table e) {
        String str = "<table>\n";
        for(DocumentElement element : e.getRows()) {
            str += element.accept(this);
        }
        return str + "</table>\n";
    }
    
    @Override
    public String visit(TableRow e) {
        String str = "<row>\n";
        for(DocumentElement element : e.getCells()) {
            str += "<cell>" + element.accept(this) + "</cell>\n";
        }
        return str + "</row>\n";
    }
}