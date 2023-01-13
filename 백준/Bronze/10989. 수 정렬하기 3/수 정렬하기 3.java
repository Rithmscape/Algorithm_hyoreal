import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] nums = new int[10001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) nums[Integer.parseInt(br.readLine())]++;
        br.close();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < 10001; i++){
            while(nums[i] > 0){
                sb.append(i).append("\n");
                nums[i]--;
            }
        }
        System.out.println(sb);
    }
}