import java.io.*;
import java.util.*;
import java.util.Map.Entry;

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
            words.put(word, words.getOrDefault(word, word.length()));
        }

        List<Entry<String, Integer>> entryList = new ArrayList<>(words.entrySet());
        entryList.sort(Entry.comparingByKey()); 
        entryList.sort(Entry.comparingByValue());

        for (Entry<String, Integer> entry : entryList) bw.write(entry.getKey() + "\n");

        bw.close();
    }
}