import java.util.Scanner;

public class ScannerDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入两个整数：");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//int num;
		//num = num1 + num2;
		//System.out.println(num);
		System.out.println(num1 + num2);
	}
}