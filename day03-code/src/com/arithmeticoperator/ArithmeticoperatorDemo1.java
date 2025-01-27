package com.arithmeticoperator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
      // +
      System.out.println(3 + 2);
      // -
      System.out.println(3 - 2);
      // *
      System.out.println(3 * 2);

      //如果在计算的时候有小数参与
        // 结果有可能是不精确的
      System.out.println(1.1 + 1.01);//2.1100000000...
        //除法
        System.out.println(10 / 2);//结果只能得到整数
        System.out.println(10.0 / 3);//3.33333333...//小数参与计算结果可能是不精确的

        //取模
        System.out.println(10 % 3);//1
        System.out.println(10 % 2);//0

        //应用场景
        //1.取模判断是否可以被整除
        //2.判断A是否为偶数，%2：0为偶数，1则奇数
        //3.发牌
    }
}
