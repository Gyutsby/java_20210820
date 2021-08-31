package com.example.vo;

public class seller {

    // 판매자 아이디
    private int id = 0;
    private int total = 0;

    // 등록한 물품들
    private item[] items = null;

    public seller() {
        items = new item[1000];
    }
    

    public seller(int n) {
        items = new item[n];
    }

    // 물품을 뒤에 1개씩 등록
    public void additem(item item) {
        items[total] = item;
        total++;
    }

    // 물품을 뒤에 1개씩 삭제
    public void removeitem() {
        if ((total - 1) < 0) {

        }
        items[total - 1] = null;
        total--;
    }

    // 전체물품 출력
    public void printitem() {
        for (int i = 0; i < total; i++) {
            System.out.println(items[i].toString());
        }
    }

    public void searchitem() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public item[] getItems() {
        return items;
    }

    public void setItems(item[] items) {
        this.items = items;
    }

}
