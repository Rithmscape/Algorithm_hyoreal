import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(BU(n, k));
    }
    
    private static int BU(int n, int k) {
        int[][] dp = new int[n + 1][k + 1];

        for (int i = 0; i <= k; i++) dp[i][i] = 1;
        for (int i = 0; i <= n; i++) dp[i][0] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= k; j++) dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
        }

        return dp[n][k];
    }
}