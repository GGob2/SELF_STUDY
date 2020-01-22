package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("+ - * / % 연산을 할 수 있는 간단한 계산기 프로그램! ");

        //변수 선언
        String name;
        double num1;
        double num2;
        String operator;

        //Scanner 선언
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요! : ");
        name = sc.next();

        System.out.println("너의 이름은 ! " + name);

        System.out.print("계산하려고 하는 첫 번째 수를 입력하세요! : ");
        num1 = sc.nextDouble();
        System.out.println(name + "이 입력한 첫 번째 수는 : " + num1 + "!");

        System.out.print("\n계산하려고 하는 연산자를 입력하세요! : ");
        operator = sc.next();
        System.out.println(name + "이 입력한 연산자는 : " + operator + "!");


        System.out.print("\n계산하려고 하는 두 번째 수를 입력하세요! : ");
        num2 = sc.nextDouble();
        System.out.println(name + "이 입력한 두 번째 수는 : " + num2 + "!");

        switch (operator) {
            case "+": {
                System.out.print("\nnum1 + num2 : ");
                System.out.println(num1 + num2);
                break;
            }
            case "-": {
                System.out.print("\nnum1 - num2 : ");
                System.out.println(num1 - num2);
                break;
            }
            case "*" : {
                System.out.print("\nnum1 * num2 : ");
                System.out.println(num1 * num2);
                break;
            }
            case "/" : {
                System.out.print("\nnum1 / num2 : ");
                System.out.println(num1 / num2);
                break;
            }
            case "%" : {
                System.out.print("\nnum1 % num2 : ");
                System.out.println(num1 % num2);
                break;
                }
            }
        }
    }

