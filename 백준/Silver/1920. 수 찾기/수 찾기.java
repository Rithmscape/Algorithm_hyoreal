import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] nArr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) nArr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(nArr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        while (m-- > 0) {
            sb.append(arrBinarySearch(nArr, Integer.parseInt(st.nextToken())) >= 0 ? 1 : 0).append("\n");
        }
        System.out.print(sb);
    }
    
    private static int arrBinarySearch(int[] nArr, int key) {
        int low = 0;
        int high = nArr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (key < nArr[mid]) high = --mid;
            else if (key > nArr[mid]) low = ++mid;
            else return mid;
        }
        return -1;
    }
}