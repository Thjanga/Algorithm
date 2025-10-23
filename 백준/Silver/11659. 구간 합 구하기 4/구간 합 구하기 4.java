import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int arrayNo = Integer.parseInt(st.nextToken()); // 배열 크기
        int sumNo = Integer.parseInt(st.nextToken());   // 구간 합 개수

        int[] sum = new int[arrayNo + 1];
        // index 0은 항상 0

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= arrayNo; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < sumNo; j++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            System.out.println(sum[end] - sum[start - 1]);
        }
    }
}
