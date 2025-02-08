package com.xunhuangaoji;

import java.util.Scanner;
public class DividendDivisor {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter two numbers:");
          int dividend = sc.nextInt();//被除数
          int divisor = sc.nextInt();//除数
          int count = 1;
          double result = dividend - divisor * count;
          while(divisor != 0 && result >= divisor){
              count ++;
              result = dividend - divisor * count;
          }
          System.out.println("余数是" + result);
          System.out.println("商是" + count);
    }
}
