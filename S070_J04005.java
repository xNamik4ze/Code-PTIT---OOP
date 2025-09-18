import java.util.Scanner;

public class S070_J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String dob = sc.nextLine();
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        double total = d1 + d2 + d3;
        System.out.println(name + " " + dob + " " + total);
        sc.close();
    }
}
