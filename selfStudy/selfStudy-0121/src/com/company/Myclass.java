package com.company;

public class Myclass {
    //메서드 = public 리턴타입 메서드명 (매겨변수 ) { 기능들 }
    public int add(int x, int y)
    {
        return x + y;
    }

    public void method1(){
        System.out.println("메서드1이 실행됨..");
    }

    public void method2(int x) {
        System.out.println(x + "를 이용했따ㅏㅏ");
    }

    public int method3(){
        System.out.println("method3이 실행됨..");
        return 10;
    }

    public void method4(int x, int y) {
        System.out.println("method4가 실행됨.." + x +" "+ y);
    }

    public int method5(int x){
        System.out.println(x + "를 이용한 method5 실행");
        return x * 2;
    }
}
