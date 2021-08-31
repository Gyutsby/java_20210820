package com.example.mongodb;

import java.util.ArrayList;
import java.util.List;

import com.example.vo.item;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.InsertOneResult;

import org.bson.BsonValue;
import org.bson.Document;
import org.bson.types.Code;

public class itemdb {
    private MongoCollection<Document> collection = null;

    // db 컬렉션 추가
    public itemdb() {
        String url = "mongodb://id307:pw307@1.234.5.158:37017/id307";
        MongoClient client = MongoClients.create(url);
        System.out.println(client);

        MongoDatabase db = client.getDatabase("id307");

        MongoIterable<String> conames = db.listCollectionNames();
        for (String tmp : conames) {
            System.out.println(tmp);
        }

        // 컬렉션 생성
        this.collection = db.getCollection("java_item00");
    }

    // db에 1개씩 추가
    public int insertitem(item item) {
        Document doc = new Document();
        doc.append("_id", item.getCode());
        doc.append("name", item.getName());
        doc.append("text", item.getText());
        doc.append("price", item.getPrice());
        doc.append("quantity", item.getQuantity());

        InsertOneResult result = this.collection.insertOne(doc);

        if (result.getInsertedId().asInt32().getValue() == item.getCode()) {
            return 1;
        }
        return 0;
    }

    // 리스트화 해서 추가하기
    public void intsertlist(List<item> list) {
        List<Document> docs = new ArrayList<Document>();

        for (item item : list) {
            Document doc = new Document();
            doc.append("_id", item.getCode());
            doc.append("name", item.getName());
            doc.append("text", item.getText());
            doc.append("price", item.getPrice());
            doc.append("quantity", item.getQuantity());
            docs.add(doc);
        }
        this.collection.insertMany(docs);

    }

    // db에 있는데 데이터 전체 조회하기
    public List<item> findallitems() {
        MongoCursor<Document> cursor = this.collection.find().iterator();

        List<item> list = new ArrayList<item>();
        // 와일문은 중간이 조건이다.
        while (cursor.hasNext()) { // 가져올 자료 있는지 확인
            Document doc = cursor.next();
            item item = new item((int) doc.get("_id"), (String) doc.get("name"), (String) doc.get("text"),
                    (int) doc.get("price"), (long) doc.get("quantity"));

            list.add(item);
        }
        return list;
    }

    // db에 있는 데이터 삭제하기
    public void deleteitem(int code) {
        this.collection.deleteOne(Filters.eq("_id", code));

    }

    // db에 있는 데이터 수정하기
    public void updateitem(item item) {
        // this.collection.updateOne(Filters.eq("_id", item.getCode()),
        // Updates.set("name", item.getName()));

        this.collection.updateOne(Filters.eq("_id", item.getCode()),
                Updates.combine(Updates.set("name", item.getName()), Updates.set("_id", item.getCode()),
                        Updates.set("text", item.getName()), Updates.set("price", item.getPrice()),
                        Updates.set("quantity", item.getQuantity())));

        // _id가 일치하는 name과 text값 변경
        // BasicDBObject updateFields = new BasicDBObject();
        // updateFields.append("name", item.getName());
        // updateFields.append("text", item.getText());
        // this.collection.updateOne(
        // Filters.eq("_id", item.getCode()), updateFields);

    }

}
