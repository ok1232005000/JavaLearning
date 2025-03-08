package Method.test;

public class testArray {
    /*设计一个方法用于数组遍历，要求遍历的结果是在一行上的。*/
    public static void main(String[] args) {
    //1.定义数组
        int[] arr = {11,22,33,44,55};
        printArray(arr);

        /*System.out.println("abc");//先打印abc，再进行换行
        System.out.print("abc");//只打印abc，不换行
        System.out.println();//不打印，只换行处理*/
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        }
        System.out.println("]");
    }
}
