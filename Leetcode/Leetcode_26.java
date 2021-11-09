package Leetcode;
// remove duplicates from a sorted array

public class Leetcode_26 {
    public static int removeDuplicates(int[] nums) {
        StringBuilder a = new StringBuilder();
        for (int num : nums) {
            if (!a.toString().contains(num + "")) {
                a.append(num);
            }
        }
        for (int i = 0; i < a.length(); i++) {
            nums[i] = Integer.parseInt(a.charAt(i) + "");
        }
        return a.length();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
