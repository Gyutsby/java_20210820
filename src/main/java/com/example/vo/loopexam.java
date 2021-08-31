package com.example.vo;

public class loopexam {

    int[] arr = new int[5]; // 배열은 길이를 잡아줘야 한다. 가변길이

    public loopexam() {
        arr[0] = 20;
        arr[1] = 30;
        arr[2] = 40;
        arr[3] = 50;
        arr[4] = 60;
        arr[5] = 70;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void breakex(int n) {

        for (int i = 0; i <= n; i++) {

            if (i >= 3) {
                break; // 반복문을 강제종료
            }
            System.out.println(i);

        }
    }

    public void continueex(int n) {
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                continue; // 아래쪽을 수행 하지 않고 다음 숫자로 반복
            }
            System.out.println(i);
        }
    }

    public void whileex(int n) {
        int i = 1;
        while (i <= 0) {
            i++;
            System.out.println(i);
        }

    }

    public void dowhileex(int n) {
        int i = 1;
        do { // 최소 1번은 수행되어야 함
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
