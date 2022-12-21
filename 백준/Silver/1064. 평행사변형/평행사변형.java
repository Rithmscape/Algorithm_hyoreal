import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Location[] arr = new Location[3];

        double[] len = new double[3];
        for(int i = 0; i < 3; i++){
            arr[i] = new Location(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        if((arr[1].y - arr[0].y) * (arr[2].x - arr[1].x)
                == (arr[1].x - arr[0].x) * (arr[2].y - arr[1].y)) System.out.println("-1");

        else {
            double min = Double.MAX_VALUE, max = Double.MIN_VALUE;

            for (int j = 0; j < 3; j++) {
                len[j]
                        = Math.sqrt(Math.pow(arr[j].x - arr[(j + 1) % 3].x, 2)
                        + Math.pow(arr[j].y - arr[(j + 1) % 3].y, 2));
            }

            for(int i = 0; i < 3; i++) {
                double sum = 0;
                sum += len[i];
                sum += len[(i + 1) % 3];

                if (sum > max) max = sum;
                if (sum < min) min = sum;
            }

            System.out.println(2 * max - 2 * min);
        }
    }
    static class Location {
        int x,y;

        public Location(int x, int y) {
            this.x = x; this.y = y;
        }
    }
}
