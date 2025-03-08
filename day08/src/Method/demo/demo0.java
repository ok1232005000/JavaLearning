package Method.demo;

public class demo0 {
    //栈：方法运行时使用的内存，比如main方法运行，进入方法栈中运行
    //堆：存储对象或者数组，new来创建的，都存储在堆内存
    //方法区：存储可以运行的class文件
    //本地方法栈：JVM在使用操作系统功能的时候使用
    //寄存器：->CPU
    public static void main(String[] args) {
        PlayGame(10,2);//实参
    }

    public static void PlayGame(int num1,int num2) {//形参
        int result = num1 + num2;
        System.out.println(result);
    }

}
