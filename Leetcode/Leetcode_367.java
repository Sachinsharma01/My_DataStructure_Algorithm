package Leetcode;

public class Leetcode_367 {
    public static boolean isPerfectSquare(int num) {
        long l = 1, r = num;
        if (num == 1)
            return true;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14));
    }
}
