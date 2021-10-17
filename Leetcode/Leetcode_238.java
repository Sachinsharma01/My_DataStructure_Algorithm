package Leetcode;

import java.util.Arrays;

public class Leetcode_238 {
//    public static int[] productExceptSelf(int[] nums) {
//        int[] res = new int[nums.length];
//        int product = 1;
//        for (int num : nums) {
//            product *= num;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0)
//                res[i] = product;
//            else
//                res[i] = product / nums[i];
//        }
//        return res;
//    }
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 1;i < nums.length; i++) {
            res[i] = nums[i - 1] * res[i - 1];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0;i--) {
            res[i] = res[i] * right;
            right = right * nums[i];
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }
}
