import java.util.Scanner;

public class S013_J01010 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int j = 0; j < t; j++) {
            String n = sc.next();
            StringBuilder result = new StringBuilder();
            boolean valid = true;
            
            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) == '0') {
                    result.append('0');
                } else if (n.charAt(i) == '1') {
                    result.append('1');
                } else if (n.charAt(i) == '8') {
                    result.append('0');
                } else if (n.charAt(i) == '9') {
                    result.append('0');
                } else {
                    valid = false;
                    break;
                }
            }

            String res = result.toString();
            res = res.replaceFirst("^0+", "");
            if (valid == false || res.isEmpty()) {
                System.out.println("INVALID");
            } else {
                System.out.println(res);
            }
        }
    }
}