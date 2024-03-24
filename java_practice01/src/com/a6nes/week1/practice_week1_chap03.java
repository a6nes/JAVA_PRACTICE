package com.a6nes.week1;

public class practice_week1_chap03 {

    public int sumTwoNumber(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        practice_week1_chap03 cal1 = new practice_week1_chap03();
        Calculator cal = new Calculator();
        int result2 = cal.minusTwoNumber(20, 10);
        int result = cal1.sumTwoNumber(20, 10);

        System.out.println("10과 20의 합 : " + result);


    }
}

