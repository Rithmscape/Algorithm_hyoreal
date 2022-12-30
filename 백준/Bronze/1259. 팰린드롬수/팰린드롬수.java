import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String num = br.readLine();
            if (num.equals("0")) break;

            String reverse = new StringBuilder(num).reverse().toString();
            System.out.println(num.equals(reverse) ? "yes" : "no");
        }
    }
}