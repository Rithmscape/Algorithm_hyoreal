import java.io.*;
import java.util.*;

public class Main {
    static class Papers{
        int paper, priority;

        public Papers(int paper, int priority) {
            this.paper = paper;
            this.priority = priority;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Queue<Papers> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                int priority = Integer.parseInt(st.nextToken());
                q.add(new Papers(j,priority));
                pq.add(priority);
            }

            int count = 1;
            while(true) {
                if(Objects.requireNonNull(q.peek()).priority == Objects.requireNonNull(pq.peek())) {
                    if(q.peek().paper == m) break;
                    count++;
                    q.poll();
                    pq.poll();
                } else q.add(q.poll());
            }
            q.clear();
            pq.clear();
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}