import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        br.readLine();
        String[] temp = br.readLine().split(" ");
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(temp));
        br.readLine();
        temp = br.readLine().split(" ");
        for (String s : temp) sb.append(hashSet.contains(s) ? "1\n" : "0\n");
        System.out.println(sb);
    }
}