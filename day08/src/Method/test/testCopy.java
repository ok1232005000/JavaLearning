package Method.test;

public class testCopy {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] copyArr = copyOfRange(arr, 2,4);

        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];
        //拷贝
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
