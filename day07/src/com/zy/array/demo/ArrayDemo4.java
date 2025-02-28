package com.zy.array.demo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        /*定义一个数组，用来存放班级中50个学生的姓名，
        * 姓名未知，等学生报道后，再进行添加*/

        String[] array = new String[50];//动态
        //添加学生
        array[0] = "zhangsan";
        array[1] = "lisi";
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);//打印出来是默认初始化值null

        //默认初始化值
        //整数：0
        //小数：0.0
        //字符：'/u0000'空格
        //布尔：false
        //引用数据：null

        //动态初始化：手动指定数组长度，只确定个数，不明确具体数值，推荐使用动态初始化
        //静态初始化：手动指定数组元素，明确具体数据，直接静态初始化
    }
}
