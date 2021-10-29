package Leetcode;

/*
* Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many
* times as it shows in both arrays and you may return the result in any order.
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> r = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j])
                j ++;
            else if (nums1[i] < nums2[j])
                i ++;
            else {
                r.add(nums1[i]);
                i ++;
                j ++;
            }
        }
        int[] res = new int[r.size()];
        for (int k = 0;k < r.size();k++) {
            res[k] = r.get(k);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}
