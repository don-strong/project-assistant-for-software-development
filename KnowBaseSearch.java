import org.bson.Document;

public class KnowBaseSearch {
    // Retrieves knowledge base entry by ID
    public KnowDB getKnowDBById(String id) {
        DBRepo dbRepo = new DBRepo("knowledge_base");
        Document query = new Document("id", id);
        Document result = dbRepo.getDocument(query);
        if (result != null) {
            return new KnowDB(
                result.getString("id"),
                result.getString("keywords"),
                result.getString("prog_lang"),
                result.getString("application"),
                result.getString("observed_errors"),
                result.getString("known_solutions")
            );
        }
        return null;
    }
    
    // Retrieves counselor entry by ID
    public Counselor getCounselorById(String id) {
        DBRepo dbRepo = new DBRepo("counselor");
        Document query = new Document("id", id);
        Document result = dbRepo.getDocument(query);
        if (result != null) {
            return new Counselor(
                result.getString("id"),
                result.getString("subject_topic"),
                result.getString("tip_hints"),
                result.getString("applicability")
            );
        }
        return null;
    }
}
