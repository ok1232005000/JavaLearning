public class numsafe {
    /*数字加密
    * 得到每位数，加5，对10取余，将所有数字反转，得到一串新的数。*/
    public static void main(String[] args) {
        int[] nums = {1,9,8,3};
        for (int i = 0; i < nums.length; i++){
            nums[i] += 5;
        }
        for (int i = 0; i < nums.length; i++){
            nums[i] = nums[i] % 10;
        }
        for (int i = 0, j = nums.length - 1; i < j; i++, j--){
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
