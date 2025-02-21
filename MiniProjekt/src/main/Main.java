package main;

import document.Document;
import facade.*;

public class Main {

	public static void main(String[] args) {

		Facade api = new Api();		
		Document testDoc = api.createDocument();		
		String id = "nyckel";		
		api.saveDocument(id, testDoc);		
		api.printDocumentElements(testDoc);		
		System.out.println(api.renderDocument(testDoc));		
		api.deleteDocument(id);
		api.getDocument(id); //should not work
		
	}

}
