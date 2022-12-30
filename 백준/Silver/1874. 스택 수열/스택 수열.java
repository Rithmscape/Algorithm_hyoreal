import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        int first = 0;

        while (n-- > 0) {
            int seq = Integer.parseInt(br.readLine());
            if (seq > first) {
                for (int i = ++first; i <= seq; i++) {
                    deque.push(i);
                    sb.append('+').append("\n");
                }
                first = seq;
            } else if (deque.peek() != seq) {
                System.out.println("NO");
                return;
            }
            deque.pop();
            sb.append('-').append("\n");
        }
        System.out.println(sb);
    }
}