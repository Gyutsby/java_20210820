package com.example.vo;

import java.util.ArrayList;

public class bookstore {
    private String name = null;
    private book[] books = new book[1000];
    private ArrayList<book> list = new ArrayList<book>(); // 가변

    // 책 1권 추가
    public void addbook(book book) {
        this.list.add(book);
    }

    // 책 1권 삭제
    public void removebook() {
        this.list.remove(this.list.size() - 1);
    }

    // 책 목록 출력
    public void printbooks() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

        for (book book : list) { // for (item of items)
            System.out.println(book.toString());
        }
    }
}
