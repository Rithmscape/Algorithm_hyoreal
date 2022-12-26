import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26]; // 알파벳 a - z 배열
        Arrays.fill(arr, -1);

        String S = br.readLine();

        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if(arr[ch - 'a'] == -1) arr[ch - 'a'] = i;
        }

        for(int val : arr) System.out.print(val + " ");
    }
}