import java.util.Random;
public class RedBag {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] newArr = new int[arr.length];
        Random rand = new Random();
        for (int i = 0; i < 5; ) {
            int randomIndex = rand.nextInt(arr.length);
            int prize = arr[randomIndex];
            boolean flag = contains(newArr, prize);
            if (!flag) {
                newArr[i] = prize;
                i++;//添加完毕后移动索引
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(newArr[i]);
        }
    }

    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
