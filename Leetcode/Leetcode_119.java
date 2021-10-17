package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_119 {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.get(0).add(1);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = res.get(i - 1);
            row.add(1);
            for (int j = 1;j < i;j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            row.add(1);
            res.add(row);
        }
//        System.out.println(res);
        return res.get(rowIndex);
    }

    public static void main(String[] args) {
        System.out.println(getRow(1));
    }
}
