package main;

import java.util.List;

import command.AddElementCommand;
import document.Document;
import document.ListElement;
import document.Paragraph;
import facade.*;

public class Main {

	public static void main(String[] args) {

		Facade api = new Api();		
		Document testDoc = api.createDocument();		
		String id = "nyckel";		
		api.saveDocument(id, testDoc);		
		api.printDocumentElements(testDoc);
		ListElement list1 = new ListElement();
		ListElement list2 = new ListElement();
		list1.add(new Paragraph("1.1"));
		list1.add(new Paragraph("1.2"));
		list1.add(new Paragraph("1.3"));
		list2.add(new Paragraph("1"));
		list2.add(list1);
		list2.add(new Paragraph("2"));
		list2.add(new Paragraph("3"));
		api.executeCommand(new AddElementCommand(testDoc, list2));
		System.out.println(api.renderDocument(testDoc));	
		//System.out.println("\\begin{document}" + api.renderAsLaTeX(testDoc) + "\\begin{document}");	
		api.undo();
		System.out.println("--Undo--");
		System.out.println(api.renderDocument(testDoc));
		//api.deleteDocument(id);
		api.addElement(testDoc, list2);
		//System.out.println(api.renderDocument(testDoc));	
		//System.out.println("\\begin{document}" + api.renderAsHTML(testDoc) + "\\begin{document}");	
		System.out.println(api.renderAsXML(testDoc));	
		api.deleteDocument(id);
		//api.getDocument(id); //should not work
		
		
	}

}
