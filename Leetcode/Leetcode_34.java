package Leetcode;

import java.util.Arrays;

public class Leetcode_34 {
    public static int[] searchRange(int[] nums, int target) {
        int lb = 1, ub = nums.length;
        int[] rs = new int[]{-1, - 1};
        while (lb <= ub) {
            int mid = (lb + (ub - lb)) / 2;
            int r = nums[mid];
            if (nums[mid] > target) {
                ub = mid - 1;
            } else if (nums[mid] < target) {
                lb = mid + 1;
            } else {
                rs[0] = mid;
                rs[1] = nums[mid + 1] == target ? mid + 1 : mid - 1;
                break;
            }
        }
        Arrays.sort(rs);
        return rs;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{1}, 0)));
    }
}

