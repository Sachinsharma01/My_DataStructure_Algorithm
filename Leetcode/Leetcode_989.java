package Leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class Leetcode_989 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> r = new ArrayList<>();
        BigInteger n = new BigInteger(0 + "");
        for (int j : num) {
            n = n.multiply(new BigInteger(10 + "")).add(new BigInteger(j + ""));
        }
        n = n.add(new BigInteger(k + ""));
        System.out.println(n);
        for (int i = 0; i < (n + "").length(); i++) {
            r.add(Integer.parseInt((n + "").charAt(i) + ""));
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3}, 516));
    }
}
