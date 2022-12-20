import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> scale = Arrays.asList("C", null, "D", null, "E", "F", null, "G", null, "A", null, "B");
        Map<String, String> result = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        int[] play = new int[n];

        for (int k = 0; k < n; k++) play[k] = Integer.parseInt(br.readLine());
        for (int i = 0; i < scale.size(); i++) {

            int sum = i;
            if (scale.get(i) == null) continue;

            for (int j = 0; j < n; j++) {
                sum = sumSize(sum + play[j], scale.size());

                if (sum >= scale.size()) sum = sumSize(sum, scale.size());
                else if (sum < 0) sum = sumSize(sum, scale.size());

                if (scale.get(sum) == null) break;
            }
            if (scale.get(sum) == null) continue;
            result.put(scale.get(i), scale.get(sum));
        }

        Object[] mapKey = result.keySet().toArray();
        Arrays.sort(mapKey);

        for (Object key : mapKey) {
            System.out.println(key + " " + result.get(String.valueOf(key)));
        }
    }

    // sum의 크기가 scale의 사이즈를 벗어날 때
    public static int sumSize(int sum, int size) {

        if (sum >= size) sum -= size;
        else if (sum < 0) sum += size;

        return sum;
    }
}