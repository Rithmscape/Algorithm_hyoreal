import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int len = String.valueOf(n).length();
        int ans = 0;

        for (int i = (n - (len * 9)); i < n; i++) {
            int num = i;
            int sum = 0;

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum + i == n) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}