package Leetcode;

import java.util.HashMap;
// majority element
public class Leetcode_169 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int num : nums)
            h.put(num, h.getOrDefault(num, 0) + 1);

        for (int num : nums)
            if (h.get(num) > (nums.length / 2))
                return num;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
