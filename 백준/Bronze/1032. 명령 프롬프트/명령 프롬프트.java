import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder pattern = new StringBuilder(br.readLine()); // 기준 문자열

        for (int i = 0; i < N - 1; i++) {
            String str = br.readLine();

            for (int j = 0; j < pattern.length(); j++) {
                if (pattern.charAt(j) != str.charAt(j)) pattern.setCharAt(j, '?');
            }
        }
        System.out.print(pattern);
    }
}