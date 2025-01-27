public class VariableDemo1{
	//主入口
	public static void main(String[] args){
		//定义变量
		//type name= value;
		//type 限定了变量存储的类型，整数浮点数
		
		//int a = 10;
		//System.out.println(a);
		
		//byte -128~127 内存1
		byte b = 10;
		System.out.println(b);
		
		//short 内存2
		//int -21e~21e 内存4
		//long 内存8
		//在数据值的后面加一个L作为后缀
		//可大可小建议大写
		long n = 9999999999L;
		System.out.println(n);
		
		//float
		//需要加一个F作为后缀
		float f = 10.1F;
		System.out.println(f);
		//double  
		double d = 10.2;
		System.out.println(d);
		
		//char 
		char c = '中';
		System.out.println(c);
		//boolean
		boolean z = true;
		System.out.println(z);
		
		//整数和小数的取值范围大小关系为：
		//double>float>long>int>short>byte
	}
}