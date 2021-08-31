package com.example.vo;

public class book {
    private int code = 0; // 책코드
    private String title = null; // 책제목
    private String author = null; // 저자
    private float discouintrate = 0.1f; // 할인률
    private String position = null; // 할인률
    private int price = 0; // 가격

    // 판매 가격 = 가격 - (가격*할인률)
    public int sellingprice() {
        return this.price - (int) (this.price * this.discouintrate);
    }

    // 생성자.
    public book() {

    }

    public book(int n) {

    }

    public book(int code, String title, String author, float discouintrate) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.discouintrate = discouintrate;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getDiscouintrate() {
        return discouintrate;
    }

    public void setDiscouintrate(float discouintrate) {
        this.discouintrate = discouintrate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "book [author=" + author + ", code=" + code + ", discouintrate=" + discouintrate + ", position="
                + position + ", price=" + price + ", title=" + title + "]";
    }
}
