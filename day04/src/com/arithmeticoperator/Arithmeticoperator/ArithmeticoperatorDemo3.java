package com.arithmeticoperator.Arithmeticoperator;

public class ArithmeticoperatorDemo3 {
    //单独使用时，++和--结果相同，但参与计算时，a++为先用后加，而++a为先加后用
    public static void main(String[] args) {
        int a = 10;
        //后++，先用后加
        int b = a++;//x = 11, y = 10;
        int c = ++a;//x自增，x = 12, z = 12;
        System.out.println("a = " + a);//12
        System.out.println("b = " + b);//10
        System.out.println("c = " + c);//12

        //赋值运算符
        //a += b,将a + b的值赋给a (-*/%)
        int x = 10;
        int y = 20;
        x += y;
        System.out.println("x = " + x);//30
        System.out.println("y = " + y);//20

        short s = 1;//提升为int类型再进行运算
        //底层都隐藏了一个强制转换
        s += 1;//等同于：s = (short)(s + 1);
        System.out.println("s = " + s);//2

    }
}
