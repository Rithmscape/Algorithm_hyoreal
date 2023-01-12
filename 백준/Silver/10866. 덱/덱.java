import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> que = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch(s) {
                case "push_front" :
                    que.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back" :
                    que.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front" :
                    sb.append(que.isEmpty() ? -1 : que.removeFirst()).append("\n");
                    break;
                case "pop_back" :
                    sb.append(que.isEmpty() ? -1 : que.removeLast()).append("\n");
                    break;
                case "size" :
                    sb.append(que.size()).append("\n");
                    break;
                case "empty" :
                    sb.append(que.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front" :
                    sb.append(que.isEmpty() ? -1 : que.peekFirst()).append("\n");
                    break;
                case "back" :
                    sb.append(que.isEmpty() ? -1 : que.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}