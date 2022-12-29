import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];
        long max = 0;

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]) max = arr[i];
        }
        System.out.println(BinarySearch(++max, N, arr));
    }

    private static long BinarySearch(long max, int N, int[] arr) {
        long mid,min = 0;

        while (min < max) {
            long count = 0;
            mid = (max + min) / 2; 
            
            for (int j : arr) count += (j / mid);
            
            if(count < N) max = mid;
            else min = mid + 1;
        }
        return min - 1;
    }
}