import java.io.File;
import java.util.Scanner;

public class S002_HELLOFILE {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("Hello.txt"));
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
