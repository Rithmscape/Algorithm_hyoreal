import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int C = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] N = new int[Integer.parseInt(st.nextToken())]; // 학생 수만큼의 요소를 가진 배열
            int avg, sum = 0, aboveAvg = 0;
            float abovePer;

            for (int j = 0; j < N.length; j++) {
                N[j] = Integer.parseInt(st.nextToken());
                sum += N[j];
            }

            avg = sum/N.length;

            for (int k : N) {
                if (k > avg) aboveAvg++;
            }

            abovePer = (float)aboveAvg/N.length * 100;
            bw.write(String.format("%.3f", abovePer) + "%\n");
        }

        bw.close();
    }
}