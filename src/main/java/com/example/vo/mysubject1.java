package com.example.vo;

public class mysubject1 extends subject {

    public mysubject1() {
    }

    public mysubject1(String name, String teacher, int score) {
        super(name, teacher, score);
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        super.print();
        System.out.println("mysubject1");
    }

}
