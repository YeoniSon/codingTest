package SWEA.D2.problem1979;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] puzzle = new int[n][n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    puzzle[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int totalCnt = 0;

            //가로
            for (int i = 0; i < n; i++) {
                int cnt = 0;
                for (int j = 0; j < n; j++) {
                    if (puzzle[i][j] == 1) {
                        cnt++;
                    } else {
                        if (cnt == k) totalCnt++;
                        cnt = 0;
                    }
                }
                if (cnt == k) totalCnt++;
            }

            //세로
            for (int j = 0; j < n; j++) {
                int cnt = 0;
                for (int i = 0; i < n; i++) {
                    if (puzzle[i][j] == 1) {
                        cnt++;
                    }else {
                        if (cnt == k) totalCnt++;
                        cnt = 0;
                    }
                }
                if (cnt == k) totalCnt++;
            }

            System.out.println("#" + tc + " " + totalCnt);

        }
    }
}
