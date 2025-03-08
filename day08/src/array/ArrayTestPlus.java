package array;
/*生成10个1~100之间的随机数存入数组，
* 1.求出所有的数据的和
* 2.求所有数据的平均数
* 3.统计有多少个数据比平均值小*/

//提高代码的可读性,将不同的功能拆分成多个for循环,便于维护
//降低代码的复杂度,减少嵌套和条件判断,提高代码的可测试性
import java.util.Random;//把这个忘了嘿嘿
public class ArrayTestPlus {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];//**定义动态数组

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("所有数据的和为: " + sum);

        double average = 0;
        average = sum / arr.length;
        System.out.println("所有数据的平均值为: " + average);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                count++;
            }
        }
        System.out.println("比平均值小的数据个数为: " + count);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
