package com.example.vo;

// 전제가 subject는 내가 만든게 아님.
// 제공해주는 클래스임
// 그러나 subject는 개조하고 싶다.
public class mysubject extends subject {

    public mysubject() {
    }

    public mysubject(String name, String teacher, int score) {

        // 부모의 생성자를 호출함.
        super(name, teacher, score);
    }

    @Override // 부모가 생성했던 메소드를 재 정의한다.
    public void print() {
        // TODO Auto-generated method stub
        super.print();

        System.out.println("mysubject는 포트폴리오");
    }

}
