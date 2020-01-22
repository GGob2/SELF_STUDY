package com.company;

        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //삼항 연산자
        // 5 > 4 가 참 이라면, b1 에 50을.. 거짓이라면 40을..
        int b1 = (5 > 4) ? 50 : 40;
        System.out.println(b1);

        int b2 = (5 < 4) ? 50 : 40;
        System.out.println(b2);

        int b3 = 0;

        if(b3 < 4){
            b3 = 40;
        }else {
            b3 = 50;
        }
        System.out.println(b3);


        // ------------------------------------------------------------
        // ------------------------------------------------------------
        // Switch

        int value = 2;

        switch (value){
            case 1 :{
                System.out.println("1 입니다.");
                break;
            }
            case 2 : {
                System.out.println("2 입니다.");
                break;
            }
            default: {
                System.out.println("그 외 다른 숫자 입니다!");
                break;
            }

        }

        String str = "A";

        switch (str){
            case "A" : {
                System.out.println("A 입니다.!");
                break;
            }
            case "B" : {
                System.out.println("B 입니다.!");
                break;
            }
        }
        //------------------------------------------------
        //------------------------------------------------
        //while

        // 0부터 9까지 출력해보기
        int i = 0 ;

        while(i<10){
            System.out.println(i);
            i++;
        }
        // 1부터 100까지 더해보기
        int sum = 0;
        int j = 1;

        while(j<=100){
            sum = sum +j;
            j++;
        }
        System.out.println(sum);

        //--------------------------------------
        //--------------------------------------
        // do - while 문 - while 문과는 다르게 무조건 1번은 실행됨.

        int a = 0;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("10을 입력하면 종료 됩니다!");
            System.out.print("숫자 1개를 입력하세요! ");

            a = scan.nextInt();
            System.out.println("입력 받은 값 : " + a +"\n");


        } while(a != 10 );
        System.out.println("종료!");

        //----------------------------------------------------
        //----------------------------------------------------
        //for문
        int total = 0;
        for (int k = 1;  k < 101; k++){
            //if( k % 2 != 0){
            //  continue;
            //}
            if(k  == 50) {
                break;
            }
            total = total + k;

        }
        System.out.println(total);
    }
}
