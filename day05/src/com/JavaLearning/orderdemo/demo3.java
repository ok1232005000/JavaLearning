package com.JavaLearning.orderdemo;

import java.util.Scanner;
public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = sc.nextInt();
        //定义一个临时变量，来记录原始x的值，最后用于比较
        int originalNumber = x;//如果没有这个，最终为false，因为最后x被循环为0
        int num = 0;
       while(x != 0){
           int ge = x % 10;//不断循环获取个位数字
           x = x / 10;//将个位数字摘出去
           num = num * 10 + ge;//利用一个新变量num从后往前组合数字，得到回文数
       }
       System.out.println(num);
       System.out.println(x);//0
       System.out.println(num == originalNumber);
    }
}
