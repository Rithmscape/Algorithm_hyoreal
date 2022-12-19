import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[][] dp = new int[30][30]; // 경우의 수 배열

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            bw.write(recursive(dp, N, M) + "\n");
        }
        bw.close();
    }

    private static int recursive(int[][] dp, int N, int M) {

        // 재귀 종료 조건
        if (dp[M][N] > 0) {
            return dp[M][N];
        }
        else if (M == N || N == 0) {
            return dp[M][N] = 1;
        }
        else {
            return dp[M][N] = recursive(dp, N - 1, M - 1) + recursive(dp, N, M - 1);
        }
    }
}