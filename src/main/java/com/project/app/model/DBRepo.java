//// import statements
//package com.project.app.model;
//import org.bson.Document;
//
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//
//// DBRepo class for database operations
//public class DBRepo {
//    // MongoDB collection and database references
//    private final MongoCollection<Document> kbarticle;
//
//    // Constructor to initialize database and collection
//    public DBRepo(String kbarticle) {
//        MongoDatabase db = DBConnection.getDatabase();
//        this.kbarticle = db.getCollection(kbarticle);
//    }
//    // Method to insert a document into the collection
//    public void insertDocument(Document doc) {
//        kbarticle.insertOne(doc);
//    }
//    // Method to retrieve documents from collection
//    public Iterable<Document> getDocuments() {
//        return kbarticle.find();
//    }
//
//    // method to get the collection
//    public MongoCollection<Document> getKbarticle() {
//        return kbarticle;
//    }
//
//}