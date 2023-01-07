import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double x = Integer.parseInt(st.nextToken());
            double y = Integer.parseInt(st.nextToken());
            double z = Integer.parseInt(st.nextToken());

            if (x == 0 && y == 0 && z == 0) break;

            if (Math.pow(x, 2) + Math.pow(y, 2) != Math.pow(z, 2)
             && Math.pow(y, 2) + Math.pow(z, 2) != Math.pow(x, 2)
             && Math.pow(z, 2) + Math.pow(x, 2) != Math.pow(y, 2)) {
                System.out.println("wrong");
            }
            else System.out.println("right");
        }
    }
}