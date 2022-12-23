import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> words = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            words.put(word, words.getOrDefault(word, word.length()));
        }

        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(words.entrySet());
        entryList.sort(Map.Entry.comparingByKey()); // 사전 순 정렬
        entryList.sort(Map.Entry.comparingByValue()); // 길이 순 정렬

        for (Map.Entry<String, Integer> entry : entryList) bw.write(entry.getKey() + "\n");
        
        bw.close();
    }
}