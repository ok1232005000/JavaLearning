package com.xunhuangaoji;

import java.util.Scanner;
public class ZhiShu {
    public static void main(String[] args) {
        //需求：键盘录入1个正整数x，判断该整数是否为一个质数

        //分析：
        //1.键盘录入x
        //2.判断：
        //从2开始循环，如果能被x整除，就不是质数
        //如果不能被整除，就是质数

        //表示最初就认为是一个质数
        boolean flag = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int x = sc.nextInt();
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                flag = false;
                //System.out.println(x + "不是质数");
                break;//结束
            }
            /*else {
                System.out.println(x + "是质数");
                break;
            }*/
        }
        if (flag) {
            System.out.println(x + "是一个质数");
        }else {
            System.out.println(x + "不是一个质数");
        }
    }
}
