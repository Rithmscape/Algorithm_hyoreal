import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Location[] arr = new Location[3];
        double min = Double.MAX_VALUE, max = Double.MIN_VALUE;
        double[] len = new double[3];
        for(int i = 0; i < 3; i++){
            arr[i] = new Location(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        if((arr[1].y - arr[0].y) * (arr[2].x - arr[1].x)
                == (arr[1].x - arr[0].x) * (arr[2].y - arr[1].y)) System.out.println("-1");

        else {
            double a = Math.sqrt(Math.pow(arr[1].y - arr[0].y, 2) + Math.pow(arr[1].x - arr[0].x, 2));
            double b = Math.sqrt(Math.pow(arr[2].y - arr[0].y, 2) + Math.pow(arr[2].x - arr[0].x, 2));
            double c = Math.sqrt(Math.pow(arr[2].y - arr[1].y, 2) + Math.pow(arr[2].x - arr[1].x, 2));
            len[0] = a + b;
            len[1] = b + c;
            len[2] = a + c;

            for(int i = 0; i < 3; i++) {
                if(min > len[i]) min = len[i];
                if(max < len[i]) max = len[i];
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