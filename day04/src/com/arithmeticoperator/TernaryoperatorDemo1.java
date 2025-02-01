package com.arithmeticoperator;

public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
        //关系表达式 ？ 表达式1 ：表达式2;
        //获取两个数的较大值
        int number1 = 10;
        int number2 = 20;
        System.out.println(number1 > number2 ? number1 : number2);

        /*
        身高为150 210 165，获取三个人的最高身高*/
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        int tmp = height1 > height2 ? height1 : height2;
        int max = height3 > tmp ? height3 : tmp;
        System.out.println(max);
    }
}
