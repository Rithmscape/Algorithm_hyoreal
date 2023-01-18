import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        long max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }

        System.out.println(BinarySearch(max, m, arr));
    }

    private static long BinarySearch(long max, int m, int[] arr) {
        long min = 0;

        while (min < max) {
            long sum = 0;
            long mid = (max + min) / 2;
            for (int j : arr) 
                if (j - mid > 0) sum += j - mid;
            if(sum < m) max = mid;
            else min = ++mid;
        }
        return --min;
    }
}