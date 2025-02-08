package com.xunhuangaoji;

import java.util.Random;//获取随机数
public class GuessNum {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(10);//范围是10，0~9，不包含10
        System.out.println(num);

        //7~15
        //-7 0~8
        //8 + 1 =9
        int num2 = rand.nextInt(9) + 7;
        System.out.println(num2);
    }
}
