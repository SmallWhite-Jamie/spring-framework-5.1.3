package com.transfer.mongondb;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

/**
 * @author lizheng
 * @date: 19:15 2019/03/16
 * @Description: HelloWorld
 */
public class HelloWorld {
    public static void main(String[] args) throws Throwable {
        MongoClient mongoClient = MongoClients.create();
        MongoDatabase database = mongoClient.getDatabase("demo");

        MongoCollection<Document> collection = database.getCollection("c1");
        collection.findOneAndDelete(Filters.eq("name", "xxx"));
//        collection.deleteOne(Filters.eq("xxx", "666"));
        FindIterable<Document> documents = collection.find();
        for (Document document : documents) {
            System.out.println(document.toJson());
            System.out.println("name: "+document.getString("name"));
            System.out.println("age: "+document.get("age"));
        }
//        System.out.println(collection.countDocuments());
//        Document document = new Document()
//                .append("name", "MongoDB")
//                .append("age", 14)
//                .append("address", "邓州");
//        collection.insertOne(document);
//        System.out.println(collection.countDocuments());
        mongoClient.close();
    }
}
