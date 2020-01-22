package com.company;

public class Main {

    public static void main(String[] args) {
	//배열 자료구조 .. 타입 선언 무조건 필요!!
       int[] array1 = new int[100];

       array1[0] = 50;
       array1[10] = 100;

       //정하지 않고 , 정함.
       int[] array3 = new int[]{1,2,3,4};

       int[] array4 = {1,2,3,4};

       int value1 = array4[1];
        System.out.println(value1);
       String[] array2 = new String[100];

        //---------------------------------------------
        // ---------------------------------------------
        // 배열 활용하기

        int [] iarray = new int[100];

        for(int i = 0; i < iarray.length; i++){
            iarray[i] = i+1;
        }


        int sum = 0;

        for(int i = 1; i <= iarray.length; i++ ){
            sum = sum + i;

        }
        System.out.println(sum);

        //---------------------------------------------
        // ---------------------------------------------
        //2차원 배열

        int [][] array5 = new int[3][4];

        array5[0][1] = 10;

        int [][] array6 = new int[3][];

        array6[0] = new int[1];
        array6[0][0] = 10;

        int [][] array7 = {{1},{1,2},{1,2,3}};

        System.out.println(array7[2][2]);

        //---------------------------------------------
        // ---------------------------------------------
        //for - each

        int [] iarr = {10,20,30,40,50};

        for(int i =0; i < iarr.length; i++){
            int value = iarr[i];
            System.out.println(value);
        }

        for(int i : iarr ){
            System.out.println("!!"+i);
        }
        //------------------------------------------
        //Class 실습
        Car c1 = new Car();
        Car c2 = new Car();

        //------------------------------------------
        // 참조타입

        int i = 4;

        String str = new String("Hello");
        //str은 String 객체의 참조하는 역할만 함..
        System.out.println(str);

        //------------------------------------------
        // String Class ..

        String str1  = "hello";
        String str2  = "hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello");

        if(str1 == str2){
            System.out.println("str1 == str2");
        }
        if(str3 == str4){
            System.out.println("str3 == str4");
        }
        //문자열이 같은지를 비교할 때, equals 메서드를 사용함
        String strr = new String("hello");
        if(strr.equals("hello")){
            System.out.println("같아!!!! ");
        }

        //substring은 자르는 것.. 잠시만 참조 해서 안바꿈
        System.out.println(str1.substring(3));




    }
}
