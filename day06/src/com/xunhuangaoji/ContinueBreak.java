package com.xunhuangaoji;

public class ContinueBreak {
    public static void main(String[] args) {
        //跳过某一次循环
        for (int i = 1; i <= 5; i++) {
            if(i == 3) {
                //结束本次循环，继续下次循环
                //跳过3
                continue;
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }
        //结束整个循环
        for (int i = 1; i <= 5; i++) {
            System.out.println("小老虎在吃第" + i + "个包子");
            if (i == 3) {
                //到3的时候，结束循环
                break;
            }
        }
    }
}
