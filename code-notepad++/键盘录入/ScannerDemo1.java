//1.导包，找到scanner这个类在哪
//书写要注意，要写在类定义的上面
import java.util.Scanner;

public class ScannerDemo1{
	public static void main(String[] args){
		//2.创建对象，表示我现在要准备使用Scanner这个类
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入整数：");
		//3.接收数据
		//变量i记录了键盘录入的数据
		int i = sc.nextInt();
		
		System.out.println(i);
	}
}