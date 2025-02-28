package com.zy.array.demo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //获取数组中的数字，利用索引
        int[] array1 = new int[]{11, 17, 16, 12, 13};
        int number = array1[0];//获取第一个数字
        System.out.println(number);

        System.out.println(array1[1]);

        //2.把数据存储到数组当中
        array1[1] = 12;//存入，一旦覆盖过后，原来的数据就不存在了
        System.out.println(array1[1]);//12
    }
}
