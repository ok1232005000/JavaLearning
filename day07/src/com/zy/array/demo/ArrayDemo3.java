package com.zy.array.demo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1,2,3,4,5};
        //2.获取数组里面所有的元素
        //利用循环
        //开始条件：0
        //结束条件：数组的长度-1
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
