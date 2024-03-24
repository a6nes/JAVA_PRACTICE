package com.a6nes.week1;

public class practice_week1_chap02 {
    public static void main(String[] args) {

        /* Application */
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65
        System.out.println(y >= 5 || x < 0 && x > 2); // true, &&가 || 보다 실행순위가 높음(&& : 11순위, || : 12순위)
        System.out.println(y += 10 - x++); // 13, y = 15, x = 2인데 계산후 x = 3이 됨
        System.out.println(x += 2); // 5
        System.out.println( !('A' <= c && c <='Z') ); // false
        System.out.println('C'-c); // 2
        System.out.println('5'-'0'); // 5
        System.out.println(c+1); // 66
        System.out.println(++c); // 66
        System.out.println(c++); // 65
        System.out.println(c); // 65

        /* Application */



    }
}
