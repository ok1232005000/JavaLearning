package com.JavaLearning.orderdemo;

import java.util.Scanner;
public class orderdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //switch case穿透：无break会一直执行case，到break为止。
        //switch新特性
        /*int number = sc.nextInt();
        switch (number) {
            case 1 -> System.out.println("一");//一行代码 + 无需break //简化
            case 2 -> {}
        }*/

        //if的第三种格式：用于对范围的判断
        //switch：把有限个数据一一列举出来

        /*输出工作日还是休息日判断*/
        System.out.println("请输入今天的星期：");
        int week = sc.nextInt();
        if (week >= 1 && week <= 5) {
            System.out.println("工作日");
        }else if (week >= 6 && week <= 7) {
            System.out.println("休息日");
        }else {
            System.out.println("没有这一天");
        }
        //case 1,2,3,4,5 -> System.out.printf();
    }
}
