import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long result = 0;
        long pow = 1; // 제곱

        for (int i = 0; i < l; i++) {
            result += (str.charAt(i) - 96) * pow;
            pow = (pow * 31) % 1234567891;
        }

        System.out.println(result);
    }
}