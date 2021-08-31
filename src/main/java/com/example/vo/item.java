package com.example.vo;

public class item {

    private int code = 0; // 물품코드
    private String name = null; // 물품명
    private String text = null; // 물품내용
    private int price = 0; // 가격
    private long quantity = 0; // 수량

    // 1. 생성자
    public item() {

    }

    public item(int code, String name, String text, int price, long quantity) {
        this.code = code;
        this.name = name;
        this.text = text;
        this.price = price;
        this.quantity = quantity;
    }

    // 2. getter/setter  (게터/세터가 있어야만 외부에서 데이터를 가져가고 쓸 수 있다.)
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    // to string
    @Override
    public String toString() {
        return "item [code=" + code + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", text="
                + text + "]";
    }

}
