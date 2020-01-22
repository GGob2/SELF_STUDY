package com.company;

public class Main {
    public static double sum(double n1, double n2){
        return n1 + n2;
    }
    public static double minus(double n1, double n2){
        return n1 -n2;
    }
    public static void main(String[] args) {
	    double n1 = 123;
	    double n2 = 23;
	    double res = Main.sum(n1, n2);

        System.out.println(res);
    }
}
