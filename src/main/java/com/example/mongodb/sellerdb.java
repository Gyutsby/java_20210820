package com.example.mongodb;

import java.util.ArrayList;
import java.util.List;

import com.example.vo.seller;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

import org.bson.Document;

public class sellerdb {
    private MongoCollection<Document> collection = null;

    // db 연결 컬렉션
    public sellerdb() {
        String url = "mongodb://id307:pw307@1.234.5.158:37017/id307";
        MongoClient client = MongoClients.create(url);
        MongoDatabase db = client.getDatabase("id307");
        MongoIterable<String> aonames = db.listCollectionNames();
        for (String tmp : aonames) {
            System.out.println(tmp);
        }

        // 컬렉션 생성
        this.collection = db.getCollection("java_seller");
    }

    public void insertseller(seller seller) {
        List<Document> list = new ArrayList<Document>();
        for (int i = 0; i < seller.getTotal(); i++) {
            Document doc = new Document();
            doc.append("code", seller.getId());
            doc.append("item", seller.getItems());
            list.add(doc);
        }
        collection.insertMany(list);
    }

    public void deleteseller() {

    }

    public void updateseller() {

    }

}
