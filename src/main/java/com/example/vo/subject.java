package com.example.vo;

public class subject {
    String name = null;
    String teacher = null;
    int score = 0;

    public subject() {
    }

    public subject(String name, String teacher, int score) {

        this.name = name;
        this.teacher = teacher;
        this.score = score;
    }

    public void print() {
        System.out.println("평가방법");
    }

    public float score() {
        return (this.score());
    }

}
