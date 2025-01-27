package test;
/*从键盘录入一个三位数，获取其中的个位、十位、百位。*/
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//键盘录入
        System.out.println("Enter an integer: ");
        int a = sc.nextInt();
        System.out.println("The unit digit is " + a % 10 + ".");//个位
        System.out.println("The ten`s digit is " + a / 10 % 10 + ".");//十位
        System.out.println("The hundred`s digit is " + a / 100 % 10 + ".");//百位
    }
}
