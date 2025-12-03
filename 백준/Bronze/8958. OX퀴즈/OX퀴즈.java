import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        String s;
        for (int i =0; i<T; i++){
            s = bf.readLine();
            int cnt = 0;
            int sum = 0;
            for (int j=0; j<s.length(); j++){
                if (s.charAt(j)=='O'){
                    cnt++;
                }
                else cnt = 0;
                sum += cnt;
            }
            System.out.println(sum);
        }
        }
}