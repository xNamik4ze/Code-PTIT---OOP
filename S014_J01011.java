import java.util.Scanner;
import java.math.BigInteger;

public class s014_J01011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger gcd = a.gcd(b);
            BigInteger lcm = (a.multiply(b)).divide(gcd);
            System.out.println(lcm + " " + gcd);
        }
        sc.close();
    }
}
