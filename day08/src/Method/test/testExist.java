package Method.test;

public class testExist {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        boolean flag = getResult(arr,0);
        System.out.println(flag);
    }

    public static boolean getResult(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        //当数组里面所有的数据全部比较完毕后，才能断定数字不存在
        return false;
    }
}
