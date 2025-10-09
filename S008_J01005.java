import java.util.Scanner;

public class S008_J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int H = sc.nextInt();
            for (int i = 1; i < N;i++) {
                double result = H * Math.sqrt((double)i / N);
                System.out.printf("%.6f ", result);
            }
            System.out.println();
        }
        sc.close();
    }
}
