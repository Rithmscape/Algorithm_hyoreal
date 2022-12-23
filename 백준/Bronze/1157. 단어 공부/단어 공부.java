import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        int[] alphabets = 
                br.readLine()
                    .toUpperCase().chars()
                    .map(ch -> ch - 65)
                    .toArray();

        int max = 0;
        char result = 0;
        for (int alphabet : alphabets) {
            arr[alphabet]++;
            if (max < arr[alphabet]) {
                max = arr[alphabet];
                result = (char) (alphabet + 65);
            }
            else if (max == arr[alphabet]) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}