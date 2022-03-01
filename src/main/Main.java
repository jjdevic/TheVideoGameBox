package main;

import com.mongodb.client.*;
import org.bson.Document;

public class Main {
    public static void main(String[] args){
        MongoClient mongoClient = MongoClients.create("mongodb+srv://MongoDB-GPS:ZUCUvvYbKW@gps.iox2a.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoDatabase db = mongoClient.getDatabase("GPS");
        MongoCollection<Document> col = db.getCollection("Test1");

        FindIterable<Document> iterDoc = col.find();
        for (Document document : iterDoc) {
            System.out.println(document);
        }
    }
}
