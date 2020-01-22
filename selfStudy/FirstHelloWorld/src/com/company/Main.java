package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    //1월 17일 공부~~~~~~~~~~~
    //프로그램의 시작점
    public static void main(String[] args) {
        System.out.println(" \n\n\n1월 17일 공부 ~~~ \n\n");

        int i;
        i = 10;

        // final 로 선언된 뒤, 한번 정의 되면 절대 값이 바뀌지 않음.
        final double PI = 3.141592;

        double circleArea;
        circleArea = 3 * 3 * PI;

        System.out.println("반지름이 3인 원의 넓이 " + circleArea);

        final int OIL_PRICE = 1450;
        int totalPrice = 50 * OIL_PRICE;
        System.out.println("이것은 기름 값 입니다 "+totalPrice);

        boolean isFun = false;
        System.out.println(false);

        char c = 'f';
        System.out.println(c);

        int x = 59;
        System.out.println(x);

        //long 타입은 항상 끝에 l or L 이 와야함
        long bing = 3434123123123213l;
        System.out.println(bing);

        float f = 32.4f;
        System.out.println(f);

        double f2 = 3333333322.4;
        System.out.println(f2);

    // 1월 18일 공부~
        System.out.println(" \n\n\n1월 18일 공부 ~~~ \n\n\n");
        int x2 = 50000;
        long x3 = x2;

        long x4 = 5;
        int x222 = (int) x4;
        System.out.println("");
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x222);
        System.out.println("");

        int i1 = -6;
        int i2 = -i1;
        int i3 = +i1;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("");

        int t1 = 4;
        int t2 = ++t1;
        System.out.println(t1);
        System.out.println(t2);

        int I = 10;
        int j = 10;

        System.out.println(I == j);
        System.out.println(I != j);

        System.out.println(I < j);
        System.out.println(I <= j);

        System.out.println(I >= j);
        System.out.println(I >  j);

        I += 10;
        System.out.println(I);

        System.out.println(I-=5);

        int a = 5;
        int b = 10;
        int c2 = 15;

        System.out.println(a>5 && b > 5);
        System.out.println(a>5 || b > 5);

        System.out.println(++a-5);
        System.out.println(a);

        System.out.println(a++ -5);

        int xx = 50;
        int yy = 60;

        if( xx  > yy ){

            System.out.println("xx가 크다아 !! ");
        }
        else{
            System.out.println("yy가 크다아아!  ");
        }

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        System.out.println(b1 && b2);
        System.out.println(b1 && b3);
        System.out.println(b1 || b2);

        int score = 99;
        if(score <= 100 && score >= 70) {
            System.out.println("성공");
        }else{
            System.out.println("시일패");
        }

        System.out.println(b1 ^ b3);
        System.out.println(!b1);

    }
}
