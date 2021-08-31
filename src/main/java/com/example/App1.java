package com.example;

/**
 * Hello world!
 *
 */
public class App1 {
    public static void main(String[] args) {

        // 변수, 조건문, 반복문, 배열, 컬렉션, 클래스, 인터페이스 -> 컬렉션, 클래스, 인터페이스 이 3개가 이해가 확실히 되어야 한다.

        // a가 3의 배수이면 3출력
        // a가 5의 배수 이면 5출력
        // a가 3의 배수 && 5의 배수이면 3,5 출력

        // int a = 15;
        // int i = 0;

        // for (i = 0; i < 5; i++) {
        // System.out.println(i + ",");
        // }

        // 0 1 2 3 4 5 6 7 8 9
        // 0 1 2 0 1 2 0 7 8 0

        int i = 15;

        for (i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        // // 같으냐 (==), 다르냐 (!=), and &&, or ||, not !
        // if (a % 3 == 0) {
        // System.out.println(a);
        // }

        // if (a == 15) {
        // System.out.println(a);
        // }

        // if (a < 15 && a == 15) {
        // System.out.println(a);
        // }

        // int a = 13; // 정수형
        // float b = 15.4f; // 실수형
        // char c = 'c'; // 문자
        // boolean d = false; // 참, 거짓
        // String e = "asdf"; // 문자열

        // System.out.println(a + b);
        // System.out.println(a - b);
        // System.out.println(a * b);
        // System.out.println(a / b);
        // System.out.println((float) a / b); // 소수점 표시
        // System.out.println(a % b); 나머지

    }
}
