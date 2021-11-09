package Leetcode;

public class Leetcode_502 {
    public static boolean checkPerfectNumber(int num) {
        int div = 0;
        for (int i = 1;i <= num/2;i++) {
            if (num % i == 0)
                div += i;
        }
        return div == num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(7));
    }
}
