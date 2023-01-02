import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> nList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (n-- > 0) nList.add(Integer.parseInt(st.nextToken()));
        Collections.sort(nList);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        while (m-- > 0) {
            System.out.println(binarySearch(nList, Integer.parseInt(st.nextToken())) >= 0 ? 1 : 0);
        }
    }
    
    private static int binarySearch(List<Integer> nList, int key) {
        int low = 0;
        int high = nList.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (key < nList.get(mid)) high = --mid;
            else if (key > nList.get(mid)) low = ++mid;
            else return mid;
        }
        return -1;
    }
}