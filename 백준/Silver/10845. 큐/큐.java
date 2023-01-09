import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> que = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int back = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch(s) {
                case "push" :
                    back = Integer.parseInt(st.nextToken());
                    que.offer(back);
                    break;
                case "pop" :
                    sb.append(que.isEmpty() ? -1 : que.poll()).append("\n");
                    break;
                case "size" :
                    sb.append(que.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(que.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front" :
                    sb.append(que.isEmpty() ? -1 : que.peek()).append("\n");
                    break;
                case "back" :
                    sb.append(que.isEmpty() ? -1 : back).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}