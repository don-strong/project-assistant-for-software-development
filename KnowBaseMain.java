import org.bson.Document;

public class KnowBaseMain {

    private final DBRepo dbRepo;

    public KnowBaseMain() {
        this.dbRepo = new DBRepo("knowledge_base");
    }

    public void insertKnowDB(KnowDB knowDB) {
        Document doc = new Document("id", knowDB.id())
                .append("keywords", knowDB.keywords())
                .append("prog_lang", knowDB.prog_lang())
                .append("application", knowDB.application())
                .append("observed_errors", knowDB.observed_errors())
                .append("known_solutions", knowDB.known_solutions());
    
    dbRepo.insertDocument(doc);
    }
}
