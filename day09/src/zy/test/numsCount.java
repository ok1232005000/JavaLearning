package zy.test;

import java.util.HashMap;
import java.util.Map;
public class numsCount {
//    public int[] twoSum(int[] nums, int target) {
//        for(int i = 0; i < nums.length; ++i){
//            for(int j = 0;j < nums.length; ++j){
//                if(target == nums[i] + nums[j] && i != j){
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return nums;
//    }
    public static void main(String[] args) {
        int[] nums = {2,3,4};
        int target = 6;
        int[] result = twoSum(nums,target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        //创建一个哈希表用于存储数组元素和下标
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {//检查是否存在符合条件的元素及下标
                return new int[]{map.get(target - nums[i]), i};//返回下标及当前i的值
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
