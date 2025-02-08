package com.xunhuangaoji;

public class skip7 {
    public static void main(String[] args) {
        //从1开始报数到100，当报的数字包含7或者是7的倍数时都要说：过
        for (int i = 1; i <= 100; i++) {
            if(i / 10 % 10 == 7 || i % 7 == 0 || i % 10 == 7) {
                //个位是7，十位是7，7的倍数
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
