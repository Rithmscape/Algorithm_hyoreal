import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String scale = "A_BC_D_EF_G_";
        List<Integer> pos = Arrays.asList(0, 2, 3, 5, 7, 8, 10);

        int n = Integer.parseInt(br.readLine());
        int[] play = new int[n];

        for (int k = 0; k < n; k++) play[k] = Integer.parseInt(br.readLine());

        for (int i = 0; i < 12; i++) {

            int sum = i;

            if (!pos.contains(i)) continue;

            for (int j = 0; j < n; j++) {
                sum = sumSize(sum + play[j]);

                if (sum < 0) sum = sumSize(sum);
                if (sum >= 12) sum = sumSize(sum);
                if (!pos.contains(sum)) break;
            }

            if (!pos.contains(sum)) continue;

            bw.write(scale.charAt(i) + " "
                    + scale.charAt(sum) + "\n");
        }
        bw.close();
    }

    // sum의 크기가 scale의 사이즈를 벗어날 때
    private static int sumSize(int sum) {
        if (sum >= 12) sum -= 12;
        else if (sum < 0) sum += 12;
        return sum;
    }
}