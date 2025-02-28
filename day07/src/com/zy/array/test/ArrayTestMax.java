package com.zy.array.test;

public class ArrayTestMax {
    public static void main(String[] args) {
        //求数组的最大值

        int[] a = {1,2,3,4,5};
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
