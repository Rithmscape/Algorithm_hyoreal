import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) sb.append(confirm(br.readLine())).append("\n");

        System.out.println(sb);
    }

    public static String confirm(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')  stack.push(str.charAt(i));
            else if (stack.empty()) return "NO";
            else stack.pop();
        }
        return stack.empty() ? "YES" : "NO";
    }
}
