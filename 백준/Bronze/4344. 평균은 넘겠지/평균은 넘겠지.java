import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        int idx = 0;

        do {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] N = new int[Integer.parseInt(st.nextToken())]; // 학생 수만큼의 요소를 가진 배열
            int avg = 0, sum = 0, aboveAvg = 0, i = 0;
            float abovePer = 0;

            while (i < N.length) {
                N[i] = Integer.parseInt(st.nextToken());
                sum += N[i];
                i++;
            }

            avg = sum/N.length;

            for (int k = 0; k < N.length; k++) {
                if (N[k] > avg) {
                    aboveAvg++;
                }
            }

            abovePer = (float)aboveAvg/N.length * 100;
            bw.write(String.format("%.3f", abovePer) + "%\n");

            idx++;
        } while (idx < C);

        bw.close();
    }
}