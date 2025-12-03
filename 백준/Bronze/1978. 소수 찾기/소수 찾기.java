import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (prime(numbers[i])) {
                cnt++;
            }
            ;
        }
        System.out.println(cnt);
    }

    public static boolean prime(int n) {
        if (n < 2) return false;
        // i*i인 이유 -> n의 약수가 존재한다면, 반드시 그 약수 둘 중 하나는 sqrt(n) 이하이다.
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
