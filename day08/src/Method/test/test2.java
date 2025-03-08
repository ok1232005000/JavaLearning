package Method.test;

public class test2 {
    public static void main(String[] args) {
        int sum1 = getSum(1, 2);
        int sum2 = getSum(2, 3);
        System.out.println(sum1 + sum2);
        System.out.println(getSum(1, 2));
    }

    public static int getSum(int a, int b) {
        int result = a + b;
        return result;//带返回值的方法：可以直接调用、赋值调用、输出调用
    }//不带返回值的方法无法赋值和输出调用

}
