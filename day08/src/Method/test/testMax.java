package Method.test;
/*输出最大值*/
public class testMax {
    public static void main(String[] args) {
        double[] arr = {1,2,3,4,5};
        getMax(arr);
    }

    public static double getMax(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        return max;
    }
}
