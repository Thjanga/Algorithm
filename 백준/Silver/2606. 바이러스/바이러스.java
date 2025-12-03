import java.util.*;

class Main {
    static boolean[][] graph;
    static boolean[] visited;
    static int N;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int M = sc.nextInt();

        graph = new boolean[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            int cmp1 = sc.nextInt();
            int cmp2 = sc.nextInt();
            graph[cmp1][cmp2] = graph[cmp2][cmp1] = true;
        }

        dfs(1);
        System.out.println(cnt - 1);
    }

    static void dfs(int v) {
        visited[v] = true;
        cnt++;

        for (int i = 1; i <= N; i++) {
            if (graph[v][i] && !visited[i]) {
                dfs(i);
            }
        }
    }
}
