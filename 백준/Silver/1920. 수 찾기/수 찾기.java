import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashSet<String> hashSet = new HashSet<>();

        while (n-- > 0) hashSet.add(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        while (m-- > 0) sb.append(hashSet.contains(st.nextToken()) ? "1\n" : "0\n");

        System.out.println(sb);
    }
}