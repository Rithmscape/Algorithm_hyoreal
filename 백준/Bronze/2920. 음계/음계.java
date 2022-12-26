import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> scale = new ArrayList<>();
        for (int i = 1; i <= 8; i++) scale.add(i);

        List<Integer> input = br.readLine().chars()
                .filter(ch -> 48 <= ch && ch <= 57)
                .map(ch -> ch - '0')
                .boxed().collect(Collectors.toList());

        if (scale.equals(input)) System.out.println("ascending");
        else {
            Collections.reverse(input);
            System.out.println(scale.equals(input) ? "descending" : "mixed");
        }
    }
}