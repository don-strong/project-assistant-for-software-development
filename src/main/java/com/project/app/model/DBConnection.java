package com.project.app.model;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class DBConnection {
    // MongoDB connection URI and database name
    private static final String URI = 
    "mongodb+srv://user123:EZpXVkdlFTrhUDZ1@projectdbcluster.8yki7dt.mongodb.net/?retryWrites=true&w=majority";
    private static final String DB_NAME = "ProjectDB";
    
    private static MongoClient client = null;
    // Method to get the MongoDatabase instance
    public static MongoDatabase getDatabase() {
        if (client == null) {
            client = MongoClients.create(URI);
        }
        return client.getDatabase(DB_NAME);
    }

}
