import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<String> nList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (n-- > 0) nList.add(st.nextToken());
        Collections.sort(nList);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        while (m-- > 0) {
            System.out.println(Collections.binarySearch(nList, st.nextToken()) >= 0 ? 1 : 0);
        }
    }
}