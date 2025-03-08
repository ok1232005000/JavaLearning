package Method.test;

public class test3 {
    //重载：名字可以相同，但是使用不同的参数
    /*需求：使用方法重载的思想，设计比较两个整数是否相同的方法。
    * 要求：兼容全整数类型（byte,short,int,long）*/
    public static void main(String[] args) {
    //调用
        compare((byte)10,(byte)30);//用哪个哪个亮
    }
    //调用方法的时候不需要那么麻烦
    public static void compare(byte b1, byte b2) {
        System.out.println(b1 == b2);
    }
    public static void compare(short s1, short s2) {
        System.out.println(s1 == s2);
    }
    public static void compare(int i1, int i2) {
        System.out.println(i1 == i2);
    }
    public static void compare(long l1, long l2) {
        System.out.println(l1 == l2);
    }
}
