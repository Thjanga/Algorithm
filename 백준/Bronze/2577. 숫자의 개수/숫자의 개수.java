import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] check = new int[10];
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a*b*c;
        while (sum>0){
            int n = sum%10;
            check[n]++;
            sum/=10;
        }
        for (int i=0; i<check.length; i++){
            System.out.println(check[i]);
        }
    }
}