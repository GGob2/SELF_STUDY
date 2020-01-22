package com.company;

 public class Main {

    public static void main(String[] args) {
        //클래스 필드 공부
        Car c1 = new Car();
        Car c2 = new Car();

        c1.name = "소방차";
        c1.number = 1234;

        c2.name = "구급차";
        c2.number = 4567;

        System.out.println(c1.name);
        System.out.println(c1.number);
        System.out.println(c2.name);
        System.out.println(c2.number);
        //---------------------------------------
        //---------------------------------------
        //메서드 공부우우

        Myclass myclass = new Myclass();

        myclass.method1();
        myclass.method2(3);
        int vaaue = myclass.method3();
        System.out.println("method3이 리턴 한 값 " + vaaue);
        myclass.method4(3,4);
        myclass.method5(3);


    }
}
