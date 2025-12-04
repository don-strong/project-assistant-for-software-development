import org.bson.Document;

public class CounselorMain {

    private final DBRepo dbRepo;
    // Constructor to initialize DBRepo for counselor collection
    public CounselorMain() {
        this.dbRepo = new DBRepo("counselor");
    }
    // Method to insert Counselor record into the database
    public void insertKnowDB(Counselor counselor) {
        Document doc = new Document("id", counselor.id())
                .append("subject_topic", counselor.subject_topic())
                .append("tip_hints", counselor.tip_hints())
                .append("applicability", counselor.applicability());
    
    dbRepo.insertDocument(doc);
    }
    // Method to retrieve all Counselor records from the database
    public Iterable<Document> getAllCounselorEntries() {
        return dbRepo.getDocuments();
    }
}