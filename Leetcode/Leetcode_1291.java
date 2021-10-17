package Leetcode;

import java.util.*;
//sub-sequential sum

public class Leetcode_1291 {
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        String a = "123456789";
        for (int i = 1; i < 10; i++) {
            for (int j = 0;j < a.length() - i + 1;j++) {
                String str = a.substring(j, i + j);
                int n = Integer.parseInt(str);
                if (n >= low && n<= high)
                    res.add(n);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sequentialDigits(1000,13000));
    }
}
