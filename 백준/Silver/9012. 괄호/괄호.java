import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		for(int i = 0; i < t; i++) sb.append(solve(br.readLine())).append("\n");
		
		System.out.println(sb);
	}
 
	public static String solve(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')  stack.push(s.charAt(i));
			else if (stack.empty()) return "NO";
			else stack.pop();
		}
        return stack.empty() ? "YES" : "NO";
	}
}