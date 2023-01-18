import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] grounds = new int[n][m];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                grounds[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, grounds[i][j]); // 제일 높은 층 찾기
                min = Math.min(min, grounds[i][j]); // 제일 낮은 층 찾기
            }
        }

        int floorMax = min;
        int timeMin = Integer.MAX_VALUE;

        for(int i = min; i <= max; i++) {
            int time = 0;
            int block = b;
            for(int r = 0; r < n; r++) {
                for(int c = 0; c < m; c++) {
                    if(grounds[r][c] > i) {
                        time += 2 * (grounds[r][c] - i);
                        block += grounds[r][c] - i;
                    }
                    else if(grounds[r][c] < i) {
                        time += i - grounds[r][c];
                        block -= i - grounds[r][c];

                    }
                }
            }

            if(block >= 0 && time <= timeMin) {
                if(time == timeMin) floorMax = Math.max(floorMax, i);
                else {
                    floorMax = i;
                    timeMin = time;
                }
            }
        }

        System.out.println(timeMin + " " + floorMax);
    }
}