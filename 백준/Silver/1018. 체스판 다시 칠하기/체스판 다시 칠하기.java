import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken()); // 열
        int col = Integer.parseInt(st.nextToken()); // 행

        String[] board = new String[row];
        for(int i = 0; i < row; i++) board[i] = (br.readLine());

        int min = Integer.MAX_VALUE; 

        for(int i = 0; i <= row - 8; i++) {
            for(int j = 0; j <= col - 8; j++) {
                int sol = solved(i, j, board);
                if(min > sol) min = sol;
            }
        }
        System.out.println(min);
    }

    private static int solved(int startRow, int startCol, String[] board) {
        String[] stanBoard = {"WBWBWBWB", "BWBWBWBW"};
        int wSol = 0;

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(board[startRow + i].charAt(startCol + j)
                        != stanBoard[(startRow + i) % 2].charAt(j)) wSol++;
            }
        }
        return Math.min(wSol, 64 - wSol);
    }
}