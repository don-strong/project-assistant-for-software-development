
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Programming Project Assistant!");
        // Creates a document for database
        KnowDB knowDBEntry = new KnowDB(
            "1",
            "Java, MongoDB",
            "Java",
            "Database Integration",
            "Connection issues",
            "Check connection string and network settings"
        );
        KnowBaseMain knowBaseMain = new KnowBaseMain();
        knowBaseMain.insertKnowDB(knowDBEntry);

        System.out.println("Inserted KnowDB Entry!");
        
    }
}
