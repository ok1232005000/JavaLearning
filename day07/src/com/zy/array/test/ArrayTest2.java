package com.zy.array.test;

public class ArrayTest2 {
    public static void main(String[] args) {
        /*定义一个数组，1-10，遍历数组得到每一个元素，
        统计数组里面一共有多少个能被3整除的数字*/

        //1.定义一个数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //2.遍历并统计
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            //3.求数组里有能被3整除的
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println("数组中能被3整除的数字有" + count + "个");
    }
}
