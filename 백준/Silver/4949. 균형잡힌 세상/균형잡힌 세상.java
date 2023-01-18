import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break;
            sb.append(confirm(str)).append("\n");
        }
        System.out.println(sb);
    }

    private static String confirm(String str) {
        Deque<Character> characters = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[') characters.push(ch);
            else if (ch == ')') {
                if (characters.isEmpty() || characters.peek() != '(') return "no";
                else characters.pop();
            } else if (ch == ']') {
                if (characters.isEmpty() || characters.peek() != '[') return "no";
                else characters.pop();
            }
        }
        return characters.isEmpty() ? "yes" : "no";
    }
}