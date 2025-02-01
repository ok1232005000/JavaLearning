package com.arithmeticoperator;

import java.util.Scanner;
public class CompareoperatorDemo1 {
    //关系运算符
    //== != > < >= <=
    //boolean true or false
    /*
    键盘录入两个整数，表示衣服时髦度。
    如果我的大于gf的，输出true*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我衣服的时髦度：");
        int myFashion = sc.nextInt();
        System.out.println("请输入女朋友衣服的时髦度：");
        int gfsFashion = sc.nextInt();

        //System.out.println(myFashion > gfsFashion);
        boolean result = myFashion > gfsFashion;
        System.out.println(result);
    }
}
