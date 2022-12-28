import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        String[] board = new String[row];

        for(int i = 0; i < row; i++) board[i] = br.readLine();

        int max = Integer.MAX_VALUE;

        for(int i = 0; i <= row - 8; i++) {
            for(int j = 0; j <= col - 8; j++) {
                int sol = solved(i, j, board);

                if(max > sol) max = sol;
            }
        }

        System.out.println(max);
    }

    private static int solved(int startRow, int startCol, String[] board) {
        String[] orgBoard = {"WBWBWBWB", "BWBWBWBW"};
        int wSol = 0;

        for(int i = 0; i < 8; i++) {
            int row = startRow + i;
            for(int j = 0; j < 8; j++) {
                int col = startCol + j;

                if(board[row].charAt(col) != orgBoard[row % 2].charAt(j)) wSol++;
            }
        }

        return Math.min(wSol, 64 - wSol);
    }
}