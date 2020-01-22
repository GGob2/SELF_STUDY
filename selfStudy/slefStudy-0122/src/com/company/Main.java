package com.company;

public class Main {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";

    int globalScope = 1220;
    static int staticValue = 7;

    public void scopeTest(int value){
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2){
        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);
        System.out.println(value2);
    }

    public static void main(String[] args) {
	    //String str = new String("hello");
	    String str = "hello world";

	    //charAt = n번째에 있는 글자가 무엇인지 보여줌
        System.out.println(str.charAt(4));
        System.out.println(str.length());
        //concat = 문자열을 결합시켜줌
        System.out.println(str.concat(" world"));

        //str자체를 바꾸고 싶을때.. 이렇게 = 로 이어줘야 함
        str = str.concat(" world") ;
        System.out.println(str);

        //substring은 자르기 기능임! - int 1개 ,n번째 부터 출력
        System.out.println(str.substring(3));
        // int 2개 , n1 ~ n2 까지 출력
        System.out.println(str.substring(3, 7));

        //-------------------------------------------
        //-------------------------------------------
        //scope 와 static

//        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);

        System.out.println(staticValue);

        //static 하지 않은 변수를 사용하려면 클래스 명으로 인스턴스를 만들어야 함.
        Main v1 = new Main();
        System.out.println(v1.globalScope);

        Main v2 = new Main();


        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);

        //static 필드는 각자 있는게 아니고.. 1곳에 있는 데이터..!
        v1.staticValue = 50;
        System.out.println(v1.staticValue);
        v2.staticValue = 100;
        System.out.println(v2.staticValue);

        //-------------------------------------------
        //-------------------------------------------
        //enum.. 열거형!

        String gender1;

        gender1 =  Main.MALE;
        gender1 =  Main.FEMALE;
        gender1 = "boy";

        System.out.println(gender1);

        Gender gender2;

        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

        System.out.println(gender2);

    }
}
//열거 하는 방법 enum. Gender 라는 클래스에는 MALE 과 FEMALE 밖에 들어가지 못함..
// 다른 값이 들어가면 Error 발생함..
enum    Gender{
    MALE, FEMALE;
}