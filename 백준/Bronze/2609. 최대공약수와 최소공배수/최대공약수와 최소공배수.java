import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 유클리드 호제법
        int n = eucd(Math.max(a, b), Math.min(a, b));

        a /= n;
        b /= n;

        int res = a * b * n;
        System.out.print(n + "\n" + res);
    }

    private static int eucd(int big, int small) {
        int r = big % small;
        if (r == 0) return small;
        else return eucd(small, r);
    }
}