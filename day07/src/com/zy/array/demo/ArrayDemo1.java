package com.zy.array.demo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //int类型的数组容器：byte short int
        //double类型的数组容器：byte short int long float double
        //int []array;
        //int array[];
        //静态初始化 在内存中，为数组容器开辟空间，将数据存入容器中的过程
        //int[] array = new int[10];
        //int[] array2 = new int[]{11, 22 , 33 , 44};//double

        //完整格式：数据类型[] 数组名 = new 数据类型[]{};
        //简化类型：数据类型[] 数组名 = {};

        //需求1：定义数组存储5个学生的年龄
        int[] array1 = new int[]{11, 17, 16, 12, 13};

        //需求2：定义数组存储3个学生的姓名
        char[] array2 = new char[]{'1', '2', '3', '4', '5'};
        String[] array = new String[]{"1", "2", "3", "4", "5"};
        //需求3：定义数组存储4个学生的身高
        double[] array3 = new double[]{171.1, 172.2, 173.3, 174.4, 175.5};
        System.out.println(array1);//地址值
    }
}
