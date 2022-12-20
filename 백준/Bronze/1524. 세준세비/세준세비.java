import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            br.readLine(); // 테스트 케이스마다 입력받는 빈 줄 처리

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int Smax = getMax(N, br); // 제일 강한 세준 병사
            int Bmax = getMax(M, br); // 제일 강한 세빈 병사

            if(Smax > Bmax) System.out.println("S");
            else if(Bmax > Smax) System.out.println("B");
            else System.out.println("S");
        }
    }

    public static int getMax(int num, BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 0;
        for(int i = 0; i < num; i++) {
            int power = Integer.parseInt(st.nextToken());
            if(max < power) max = power;
        }
        return max;
    }
}