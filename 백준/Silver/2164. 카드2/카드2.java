import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        int n = new Scanner(System.in).nextInt();

        for (int i = 1; i <= n; i++) deque.add(i);
        while (deque.size() != 1) {
            deque.removeFirst();
            deque.add(deque.poll());
        }
        System.out.println(deque.poll());
    }
}