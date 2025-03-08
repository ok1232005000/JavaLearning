package array;

public class ArrayTestSwitch {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
//        int[] array2 = new int[5];
//        for (int i = 0; i < array.length; i++) {
//            array2[i] = array[array.length - (i + 1)];
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array2[i] + " ");
//        }

        //利用临时变量交换数据
        for (int i = 0,j = array.length - 1; i < j; i++,j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
