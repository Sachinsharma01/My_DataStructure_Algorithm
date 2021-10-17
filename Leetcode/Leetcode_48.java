package Leetcode;

import DSA_College.LinkList.ListNode;

import java.util.Arrays;

public class Leetcode_48 {
    public static void rotate(int[][] matrix) {
        if (matrix.length !=  1) {
            int n = matrix.length;
            for (int layer = 0; layer < n/2; layer++) {
                int last = n - 1 - layer, first = layer;
                for (int i=first; i<last; i++) {
                    int offset = i - first;
                    int top = matrix[first][i];
                    matrix[first][i] = matrix[last-offset][first];
                    matrix[last-offset][first] = matrix[last][last-offset];
                    matrix[last][last-offset] = matrix[i][last];
                    matrix[i][last] = top;

                }
            }
            System.out.println(Arrays.deepToString(matrix));
        }
    }

    public static void main(String[] args) {
        rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }
}
