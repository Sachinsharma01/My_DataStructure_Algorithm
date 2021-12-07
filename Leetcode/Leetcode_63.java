package Leetcode;

public class Leetcode_63 {
    public static int uniquePathsWithObstacles(int[][] ar) {
        if (ar[0][0] == 1)
            return 0;
        int row = ar.length;
        int col = ar[0].length;
        for (int i = 0;i < row;i++) {
            for (int j = 0;j < col;j++) {
                if (i == 0 || j == 0 && ar[i][j] != 1) {
                    if (ar[i][j] == 1 || (i != 0 && ar[i - 1][0] == 0) || (j != 0 && ar[i][j - 1] == 0)) {
                        ar[i][j] = 0;
                    } else {
                        ar[i][j] = 1;
                    }
                } else {
                    if (ar[i][j] == 1) {
                        ar[i][j] = 0;
                    } else {
                        ar[i][j] = ar[i - 1][j] + ar[i][j - 1];
                    }
                }
            }
        }
        return ar[row][col];
    }

    public static void main(String[] args) {
        System.out.println(uniquePathsWithObstacles(new int[]{}));
    }
}
