import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int idx = 0;
        String[] arr = new String[n];

        while (idx < n) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[idx] = st.nextToken();
            idx++;
        }

        for (int i = 0; i < n; i++) {
            int count = 0, grade = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'O') {
                    count++;
                    grade += count;
                    continue;
                }
                count = 0;
            }
            bw.write(grade + "\n");
        }
        bw.close();
    }
}