package singleton;

import java.util.HashMap;
import java.util.Map;

import document.Document;

public class DocumentManager {
	
	public static DocumentManager instance;
	private Map<String, Document> documentStorage;
	
    private DocumentManager() {
        documentStorage = new HashMap<>();
    }

    public static DocumentManager getInstance() {
        if (instance == null) {
            instance = new DocumentManager();
        }
        return instance;
    }

    public void saveDocument(String id, Document document) {
        documentStorage.put(id, document);
    }

    public Document getDocument(String id) {
        return documentStorage.get(id);
    }
    

    public void deleteDocument(String id) {
        documentStorage.remove(id);
    }

    public boolean documentExists(String id) {
        return documentStorage.containsKey(id);
    }
}
