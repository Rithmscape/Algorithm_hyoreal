import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) existPrime(i, m);
    }

    private static void existPrime(int num, int m) {
        if (num < 2) return;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return;
        }
        if (num >= m) System.out.println(num);
    }
}