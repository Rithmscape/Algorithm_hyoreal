import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String multi = String.valueOf(Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));
        int[] result = new int[10];

        for (int i = 0; i < multi.length(); i++) result[multi.charAt(i) - 48]++;

        for (int num : result) System.out.println(num);
    }
}