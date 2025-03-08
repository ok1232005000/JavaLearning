package array;
/*定义一个数组，存入1-5
 要求打乱数组中所有数据的顺序。*/
import java.util.Random;
public class ArrayTestOrder {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        Random r = new Random();

        for (int i = 0, j = r.nextInt(5); i < arr.length; i++) {//这里的j为随机索引
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
