import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a==0&&b==0&&c==0){
                return;
            }
            int [] n = new int[3];
            n[0] = a;
            n[1] = b;
            n[2] = c;
            Arrays.sort(n);
            if (n[0]*n[0]+n[1]*n[1]==n[2]*n[2]) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
