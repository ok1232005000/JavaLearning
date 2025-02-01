package com.arithmeticoperator;

import java.util.Scanner;
public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        //^ 异或，相同为false，不同为true
        //& && 且 //| || 或 //！非
        //短路逻辑运算符
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println("a = " + a);//11
        System.out.println("b = " + b);//10 : ++a < 5 已经为false，因此b 将不会进行自增，b = 10;
        System.out.println("result = " + result);//false

        /*
        键盘录入两个整数，如果其中一个为6，最终结果输出为true，
        如果他们的和为6的倍数。最终结果输出为true。
        其他情况都是false。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean result0 = num1 == 6 || num2 == 6 || (num1 + num2) % 6 == 0;
        System.out.println("result = " + result0);
    }
}
