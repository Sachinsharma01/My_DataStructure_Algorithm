import java.math.BigInteger;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int a = sc.nextInt();
//                BigInteger fact = BigInteger.ONE;
//                for (int i = 1; i <= a; i++) {
//                    fact = fact.multiply(BigInteger.valueOf(i));
//                }
//                String s = fact.toString();
//                int count = 0;
//                for (int i = s.length() - 1; i >= 0; i--) {
//                    if (s.charAt(i) == '0')
//                        count++;
//                    else
//                        break;
//                }
                int count = 0;
                for (int i = 5; a / i >= 1; i *= 5)
                    count += a / i;
                System.out.println(count);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}