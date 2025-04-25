package zy.test;

public class findSushu {
    public static void main(String[] args) {
        /*判断 101~200 之间有多少个素数，并除数所有素数*/
        int count = 0;
        for (int i = 101; i < 201; i++) {
            boolean flag = true;//**
            for (int j = 2; j < 100; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);

    }
}
