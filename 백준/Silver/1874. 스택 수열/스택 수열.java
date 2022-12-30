import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        int first = 0;

        while (N-- > 0) {
            int value = Integer.parseInt(br.readLine());

            if (value > first) {
                for (int i = ++first; i <= value; i++) {
                    deque.push(i);
                    sb.append('+').append("\n");
                }
                first = value;
            } else if (deque.peek() != value) {
                bw.write("NO");
                bw.close();
                return;
            }
            deque.pop();
            sb.append('-').append("\n");
        }
        bw.write(String.valueOf(sb));
        bw.close();
    }
}