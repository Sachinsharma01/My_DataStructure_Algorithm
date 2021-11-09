package Leetcode;

import java.util.Arrays;

// first binary search to the row ad if we find the potential row then we binary search for the target
public class Leetcode_74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = searchRow(matrix, target);
        if (row == -1)
            return false;
        return binarySearch(matrix[row], target);
    }
    public static int searchRow(int[][] m, int target){
        int lb = 0, ub = m.length - 1;
        int lastColumn = m[0].length - 1;
        while (lb <= ub) {
            int mid = (lb + ub) / 2;
            if (m[mid][0] <= target && m[mid][lastColumn] >= target)
                return mid;
            else if (m[mid][0] < target)
                lb = mid + 1;
            else
                ub = mid - 1;
        }
        return -1;
    }

    public static boolean binarySearch(int[] m, int target){
        int r = Arrays.binarySearch(m, target);
        return r >= 0;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;
        System.out.println(searchMatrix(matrix, target));
    }
}
