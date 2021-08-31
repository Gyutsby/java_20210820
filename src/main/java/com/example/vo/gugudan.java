package com.example.vo;

public class gugudan {

    private int num = 0; // unm이 1단이면 1단 뭐 2단이면 이런식으로 되면 되겠다.

    public gugudan(int num) {
        this.num = num;
    }

    // 구구단 구현하기
    public void print() {
        System.out.println("gugudan");

        int i = 1;

        for (i = 1; i <= 100; i++) {
            if (this.num == this.num * i) {
                // System.out.println(a + "*" + b + "=" + c); // 1*2=4
                // System.out.println(this.num + "x" + this.num + "=" + num * i); // 1*2=4
                System.out.println(this.num + "x" + 1 + "=" + this.num); // 1*2=4
            }
        }
    }

    // 생성자를 만들면 defult생성자는 반드시 새로 만듬
    public gugudan() {

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "gugudan [num=" + num + "]";
    }

}
