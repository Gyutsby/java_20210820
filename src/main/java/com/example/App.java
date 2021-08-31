package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JFrame;

import com.example.gui.myframe;
import com.example.mongodb.itemdb;
import com.example.mongodb.sellerdb;
import com.example.vo.bookstore;
import com.example.vo.item;
import com.example.vo.mysubject;
import com.example.vo.mysubject1;
import com.example.vo.seller;
import com.example.vo.staticexam;
import com.example.vo.subject;

import org.bson.types.Code;

// import java.util.Scanner;

// import com.example.vo.gugudan;
// import com.example.vo.loopexam;

// import com.example.vo.member;

/**
 * Hello world!
 *
 */
public class App {
    // public static void main(String[] args) {
    // // 1. 객체 생성 (다른 클래스를 이용)
    // // 클래스명 객체 = new 클래스명();

    // member mem = new member(345);
    // mem.setuserid(1);

    // mem.setusername("aaa");
    // mem.setuserphone("010-0000-0000");
    // mem.setuserage(20);

    // System.out.println(mem.toString());

    // int id = mem.getuserid();
    // System.out.println(id);
    // }

    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // int a = scanner.nextInt();
    // int b = scanner.nextInt();
    // System.out.println(a + b);
    // scanner.close();
    // }

    // }

    public static void main(String[] args) {

        new myframe("제목");

        // 클래스명 x1 = new 생성자() -> 객체를 여러개 생성
        // 클래스명 x2 = 클래스명.메소드 -> 객체를 1개만 생성

        // subject z3 = new mysubject();
        // z3.print();

        // System.out.println("++++++++++++++++++++++++");

        // subject z4 = new mysubject1();
        // z4.print();

        // sellerdb c1 = new sellerdb();
        // System.out.println(c1);

        // // 객체 생성시 db연결, 컬렉션 선택
        // itemdb n1 = new itemdb();
        // List<item> list = n1.findallitems();

        // for (item item : list) {
        // System.out.println(item.toString());
        // }

        // n1.deleteitem(10005); // 삭제 할 코드

        // item i1 = new item(10037, "aaa", "bbb", 1111, 2222);
        // n1.updateitem(i1);

        // item i1 = new item(10005, "규", "츠", 2500, 20);
        // n1.insertitem(i1);

        // item i1 = new item(10015, "규", "츠", 2500, 20);
        // item i2 = new item(10026, "규", "츠", 2500, 20);
        // item i3 = new item(10037, "규", "츠", 2500, 20);

        // List<item> list = new ArrayList<item>();

        // list.add(i1);
        // list.add(i2);
        // list.add(i3);

        // n1.intsertlist(list);

        // staticexam s1 = new staticexam(4, 5);
        // int a = s1.sum();
        // System.out.println(a);

        // int b = staticexam.sub();
        // System.out.println(b);

        // // // 판매자 1명 생성 (아이디 1001)
        // // seller s1 = new seller();
        // // s1.setId(1001);

        // // 물품 3개 생성
        // item i1 = new item(101, "사과", "내용", 3000, 500);
        // item i2 = new item(102, "배", "내용1", 2000, 1500);
        // item i3 = new item(103, "꿀", "내용2", 1000, 2500);

        // // 클래스명 map = new 클래스명()
        // // 키가 중복되면 안됨
        // HashMap<String, item> map = new HashMap<String, item>();
        // map.put("itm1", i1);
        // map.put("itm2", i2);
        // map.put("itm3", i3);

        // item t1 = map.get("itm1");
        // item t2 = map.get("itm2");
        // System.out.println(t1);
        // System.out.println(t2);

        // ArrayList<item> list = new ArrayList<item>();

        // list.add(i1);
        // list.add(i2);
        // list.add(i3);

        // for (int i = 0; i < list.size(); i++) {
        // item tmp = list.get(i);
        // System.out.println(tmp.toString());
        // }

        // for (item tmp : list) { // 위치를 알수는 없으나 전체 반복
        // System.out.println(tmp.toString());
        // }

        // // 판매 물품 등록
        // s1.additem(i1);
        // s1.additem(i2);
        // s1.additem(i3);

        // s1.printitem();

        // // 판매자 1명 생성 (아이디 1002)
        // seller s2 = new seller();
        // s2.setId(1002);

        // // 물품 생성
        // item i11 = new item(1010, "사과1", "내용1", 13000, 1500);
        // item i21 = new item(1020, "배1", "내용11", 21000, 11500);
        // item i31 = new item(1030, "꿀1", "내용21", 11000, 21500);

        // s2.additem(i11);
        // s2.additem(i21);
        // s2.additem(i31);
        // s2.printitem();

        // }

        // bookstore s1 = new bookstore();
    }
}
