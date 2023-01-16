import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int lCnt = 0;
        int rCnt = 0;
        int lMax = 0;
        int rMax = 0;

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(st.nextToken()) == 1) {
                if (rCnt > 0) rCnt--;
                lCnt++;
                lMax = Math.max(lCnt, lMax);

            }
            else {
                if (lCnt > 0) lCnt--;
                rCnt++;
                rMax = Math.max(rMax, rCnt);
            }
        }

        System.out.println(Math.max(lMax, rMax));
    }
}
