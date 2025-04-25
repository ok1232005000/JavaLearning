package zy.test;

public class CopyArr {
    /*把数组中的元素复制到另一个数组中。*/
    //定义一个老数组
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //长度一致
        int[] newArr = new int[arr.length];
        //遍历
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }
    }
}
