package Leetcode;

import java.util.HashMap;

public class Leetcode_560 {
    public static int subarraySum(int[] nums, int k) {
        int[] res = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int maxEnd = 0, maxHere = Integer.MIN_VALUE;
            for (int j = i; j < nums.length; j++) {
                maxHere += nums[i];
                if (maxEnd == k) {
                    count++;
                    break;
                }
                if (maxHere > maxEnd) {
                    maxEnd = maxHere;
                    maxHere = 0;
                } else if (maxHere < 0) {
                    maxHere = 0;
                }
            }
        }
        return count;
    }

    private static boolean subSum(int i, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        return false;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1, 1, 1}, 2));
    }
}
