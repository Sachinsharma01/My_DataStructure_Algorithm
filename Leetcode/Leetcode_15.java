package Leetcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int a = i + 1, k = nums.length - 1;
            while (a < k) {
//                System.out.println(nums[i] + " " + nums[a] + " " + nums[k]);
                int sum = nums[i] + nums[a] + nums[k];
//                System.out.println(sum);
                if (sum < 0) a++;
                else if (sum > 0) k--;
                else {
                    ArrayList<Integer> r = new ArrayList<>();
                    r.add(nums[i]);
                    r.add(nums[a]);
                    r.add(nums[k]);
//                    System.out.println("vgbtru");
                    if (!res.contains(r)) {
//                        System.out.println(r);
                        res.add(r);
                    }
                    a ++;
                    k --;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-2,0,1,1,2}));
    }
}
