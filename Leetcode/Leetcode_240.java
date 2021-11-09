package Leetcode;

import java.util.Arrays;

public class Leetcode_240 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        return searchRow(matrix, target);
    }
    public static boolean searchRow(int[][] m, int target){
        for (int[] ints : m) {
            boolean r = binarySearch(ints, target);
            if (r == true)
                return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] m, int target){
        int r = Arrays.binarySearch(m, target);
        return r >= 0;
    }

    public static void main(String[] args) {
        int target = 5;
        int[][] m = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(searchMatrix(m, target));
    }
}
