package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        if (nums.length < 1)
            return rs;
        helper(rs, new ArrayList<>(), nums, new boolean[nums.length]);
        return rs;
    }

    public void helper(List<List<Integer>> rs, List<Integer> arr, int[] nums, boolean[] visited) {
        if (arr.size() == nums.length) {
            rs.add(new ArrayList<>(arr));
            return;
        }
        for (int i = 0;i < nums.length;i++) {
            if (visited[i])
                continue;
            arr.add(nums[i]);
            visited[i] = true;
            helper(rs, arr, nums, visited);
            arr.remove(arr.size() - 1);
            visited[i] = false;
        }
    }
}
