import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 1;
        while (a < n) a *= 2;
        a /= 2;
        System.out.print(n == 1 ? 1 : (n - a) * 2);
    }
}