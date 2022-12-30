import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 665;
        int i = 0;

        while (i < n) { num++;
            if (check(num)) i++;
        }

        System.out.println(num);
    }

    private static boolean check(int num) {
        int count = 0;
        while (num > 1) {
            if (num % 10 == 6) ++count;
            else count = 0;

            if (count == 3) return true;
            num /= 10;
        }
        return false;
    }
}