package Leetcode;

public class Leetcode_231 {
    // iterative approach
//    public boolean isPowerOfTwo(int n) {
//        if (n <= 0)
//            return false;
//        while(n > 1) {
//            if (n % 2 != 0)
//                return false;
//            n = n / 2;
//        }
//        return true;
//    }

    // bitwise approach
//    public static boolean isPowerOfTwo(int n) {
//        int a = Integer.bitCount(n);
//        return a == 1;
//
//    }

    // bitwise approach 2
    public static boolean isPowerOfTwo(int n) {
        if (n == 0)
            return false;
        return ((long) n & ((long) n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(28));
    }
}
