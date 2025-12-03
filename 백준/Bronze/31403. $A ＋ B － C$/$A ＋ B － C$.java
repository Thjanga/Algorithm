
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println(A+B-C);
        String new_A = A+"";
        String new_B = B+"";
        String new_String = new_A.concat(new_B);
        int new_int = Integer.parseInt(new_String);
        System.out.println(new_int-C);
    }
}
