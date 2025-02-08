package com.xunhuangaoji;

import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        //键盘录入一个大于等于2的整数x，计算并返回x的平方根
        //结果只保留整数部分，小数部分将被舍去
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数：");
        int x = sc.nextInt();
        if (x < 2) System.out.println("数字无效。");
        else {
            for (int i = 1; i <= x; i++) {
                if (i * i == x) {
                    System.out.println(x + "的平方根是" + i);
                    break;
                }
                else if(i * i > x) {
                    System.out.println(x + "的平方根是" + (i-1));
                    break;
                }
            }
        }
    }
}
