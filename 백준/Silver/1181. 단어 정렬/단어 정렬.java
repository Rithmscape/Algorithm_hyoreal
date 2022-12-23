import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> words = new HashMap<>();

        String word = br.readLine();
        words.put(word, word.length());

        for (int i = 0; i < n-1; i++) {
            word = br.readLine();
            if (words.containsKey(word)) continue;
            words.put(word, words.getOrDefault(word, word.length()));
        }

        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(words.entrySet());
        entryList.sort(Map.Entry.comparingByKey()); // 사전 순 정렬
        entryList.sort(Map.Entry.comparingByValue()); // 길이 순 정렬

        // System.out.println 사용시 632ms, bufferedWriter 사용시 476ms
        for (Map.Entry<String, Integer> entry : entryList) bw.write(entry.getKey() + "\n");

        bw.close();
    }
}