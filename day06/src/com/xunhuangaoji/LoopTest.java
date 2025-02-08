package com.xunhuangaoji;

import java.util.Random;
import java.util.Scanner;
public class LoopTest {
    public static void main(String[] args) {
        //抽奖机制
        //保底360次

        //用来统计当前次数
        int count = 0;

        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            //guessNum要放在里面，否则无法重新输入数字；
            System.out.println("请输入你要猜的数字：");
            int guessNum = sc.nextInt();

            count++;
            if (count == 3) {
                System.out.println("保底了！");
                break;
            }
            if (num > guessNum) {
                System.out.println("猜小了！");
            }else if (num < guessNum) {
                System.out.println("猜大了！");
            }else {
                System.out.println("猜对了！");
                break;
            }
        }
    }
}
