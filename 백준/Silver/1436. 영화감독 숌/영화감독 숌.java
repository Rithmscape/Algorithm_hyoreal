import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int count = 0;
        int num = 666;

        while (count < n) {
            if (String.valueOf(num).contains("666")) count++;
            num++;
        }
        System.out.println(num - 1);
    }
}