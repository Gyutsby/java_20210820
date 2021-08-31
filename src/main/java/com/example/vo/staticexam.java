package com.example.vo;

public class staticexam {
    private int num1 = 0;
    private int num2 = 0;

    // 생성장 : 클래스명과 같다.
    public staticexam(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public staticexam() {
    }

    // public static sub(){
    
    // }

    // 메소드
    public int sum() {
        return this.num1 + this.num2;
    }



}
