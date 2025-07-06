package com.autobots.java.lambda.bankApplication;

public class Demo {
    public static void main(String[] args) {

        int reslult = sum(5, 6);
        System.out.println(reslult);
     //  int result2 = sum2(5, 6);              не правильно
        sum2(5, 6); //                    правильно
        String result3 = sum3(8, 6);   // в виде строки
        System.out.println(result3);

    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static void sum2(int a, int b){
        System.out.println(a + b);
    }

    public static String sum3(int a, int b){  // в виде строки
        return String.valueOf(a + b);
    }
}
