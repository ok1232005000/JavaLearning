package zy.test;

import java.util.Random;

public class lab {
    public static void main(String[] args) {
        int totalRuns = 1000; // 循环次数
        int totalCount = 0;
        int validRuns = 0; // 记录满足条件的循环次数

        for (int run = 0; run < totalRuns; run++) {
            double[] arr = new double[10];
            Random rand = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(2);
            }
            double sum = 0.0;
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                count++;
                if (sum > 1) {
                    totalCount += count;
                    validRuns++;
                    break;
                }
            }
        }

        if (validRuns > 0) {
            double averageCount = (double) totalCount / validRuns;
            System.out.println("多次循环后平均在数组的第 " + averageCount + " 个数满足 if 语句的条件");
        } else {
            System.out.println("在所有循环中，都没有满足 if 语句条件的情况。");
        }
    }
}