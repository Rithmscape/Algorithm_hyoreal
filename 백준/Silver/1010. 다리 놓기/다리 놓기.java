import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static final int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            bw.write(recursive(M, N) + "\n");
        }
        bw.flush();
        bw.close();
    }
    
    private static int recursive(int n, int r) {

        if (dp[n][r] > 0) {
            return dp[n][r];
        }
        else if (n == r || r == 0) {
            return dp[n][r] = 1;
        }
        else {
            return dp[n][r] = recursive(n - 1, r - 1) + recursive(n - 1, r);
        }
    }
}