package zy.test;

import java.util.Scanner;
public class flightTicket {
    public static void main(String[] args) {
        /*卖飞机票
        * 机票的价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱
        * 旺季（5-10）头等舱9折，经济舱8.5折，
        * 淡季（11月到来年4月）头等舱7折，经济舱6.5折。*/
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入机票的原价:");
        double price = sc.nextInt();
        System.out.println("请输入当前的月份:");
        int month = sc.nextInt();
        System.out.println("请输入当前的舱位: 1.头等舱；2.经济舱。");
        int type = sc.nextInt();

        if (month >= 5 && month <= 10) {
            price = getPrice(price,month,type,0.9,0.85);
        } else if ((month >= 11 && month <= 12) || (month >= 1 && month <=4)) {
            price = getPrice(price,month,type,0.7,0.65);
        } else {
            System.out.println("当前输入的月份不合法。");
        }

        System.out.println("Price: " + price);
    }

    public static double getPrice(double price, int month,int type,double t1,double t2) {
        if (type == 1) price = price * t1;
        else if (type == 2) price = price * t2;
        else System.out.println("没有这个舱位。");
        return price;
    }
}
