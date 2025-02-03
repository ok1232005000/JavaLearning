package com.JavaLearning.orderdemo;

public class demo2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("1");
        }
        int a = 1;
        while(a <= 100){
            System.out.println(a);
            a++;
        }


        double n = 0.1;
        int count = 0;
        //不知道循环的次数和范围
        while(n <= 8844430){
            n = n * 2;
            count++;
        }
        System.out.println(count);
    }
}
