import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // HashMap 사용 (이메일을 키로, 비밀번호를 값으로)
        Map<String, String> emailPasswordMap = new HashMap<>();

        // 이메일과 비밀번호 입력받기
        for (int i = 0; i < N; i++) {
            String n = br.readLine();
            st = new StringTokenizer(n);
            String email = st.nextToken();
            String password = st.nextToken();
            emailPasswordMap.put(email, password);  // 이메일을 키로, 비밀번호를 값으로 저장
        }

        // M개의 이메일에 대해 비밀번호 찾기
        for (int i = 0; i < M; i++) {
            String findEmail = br.readLine();
            // 이메일이 존재하면 비밀번호 출력
            bw.write(emailPasswordMap.get(findEmail) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
