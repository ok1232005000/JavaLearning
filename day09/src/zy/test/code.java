package zy.test;

import java.util.Random;
public class code {
    public static void main(String[] args) {
        /*需求：
        * 定义方法实现随机产生一个5位的验证码
        * 验证码格式：
        * 长度为5
        * 前四位是大写的字母或者是小写字母
        * 最后一位是数字*/

        String result1 = "";//**
        String result2 = "";

        //字母
        char[] arr1 = new char[52];
        for (int i = 0; i < arr1.length; i++) {
            if(i <= 25) {//小写字母
                arr1[i] = (char) (97 + i);//'a'
            }else{
                arr1[i] = (char) (65 + i - 26);//'A'
            }
        }

        for (int i = 0; i < 4; i++) {//设置数字，要求生成几位随机字母
            int index = new Random().nextInt(arr1.length);//循环随机
            result1 += arr1[index];
        }

        //数字
        int num = new Random().nextInt(10);//0~9
        result2 += num;

        System.out.println("code:" + result1 + result2);
    }
}
